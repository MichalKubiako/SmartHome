package com.competence_week.smarthome.ui.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.competence_week.smarthome.data.models.Room
import com.competence_week.smarthome.databinding.ItemRoomPreviewBinding

class RoomListAdapter : RecyclerView.Adapter<RoomListViewHolder>() {

    var list = listOf<Room>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomListViewHolder =
        RoomListViewHolder(
            ItemRoomPreviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}

class RoomListViewHolder(private val binding: ItemRoomPreviewBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Room) {

    }
}