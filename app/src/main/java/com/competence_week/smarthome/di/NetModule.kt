package com.competence_week.smarthome.di

import com.competence_week.smarthome.BuildConfig
import com.competence_week.smarthome.di.NetTimes.TIMEOUT_LIMIT
import com.competence_week.smarthome.data.net.BaseRetrofit
import com.competence_week.smarthome.data.net.NetHome
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

object NetTimes {
    const val TIMEOUT_LIMIT = 180L
}

//DI with Dagger and Hilt https://developer.android.com/training/dependency-injection/hilt-android
// https://www.youtube.com/watch?v=bbMsuI2p1DQ

@InstallIn(SingletonComponent::class)
@Module
class NetModule {

    @Provides
    @Singleton
    @Named("LoginOkHttpClient")
    fun provideApiOkHttpClient(): OkHttpClient {
        var okHttpClientBuilder = OkHttpClient.Builder()

        okHttpClientBuilder = okHttpClientBuilder
            .connectTimeout(TIMEOUT_LIMIT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_LIMIT, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_LIMIT, TimeUnit.SECONDS)

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
                okHttpClientBuilder = okHttpClientBuilder.addInterceptor(this)
            }
        }

        return okHttpClientBuilder.build()
    }


    @Provides
    @Singleton
    fun provideRetrofit(@Named("LoginOkHttpClient") okHttpClient: OkHttpClient)
            : BaseRetrofit = BaseRetrofit(okHttpClient)

    @Provides
    @Singleton
    fun provideHomeRestApi(retrofit: BaseRetrofit): NetHome =
        retrofit.retrofit.create(NetHome::class.java)
}