package com.competence_week.smarthome.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.competence_week.smarthome.databinding.FragmentHomeBinding
import com.competence_week.smarthome.ui.base.BaseFragment
import com.competence_week.smarthome.utils.DateUtils
import dagger.hilt.android.AndroidEntryPoint

//navigation - https://developer.android.com/guide/navigation/navigation-navigate

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private val viewModel: HomeViewModel by viewModels()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getHomeData()

        binding.textviewFirst.text = DateUtils.getTodayDate()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}