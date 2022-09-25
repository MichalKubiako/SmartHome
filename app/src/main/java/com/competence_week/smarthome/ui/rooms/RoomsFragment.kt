package com.competence_week.smarthome.ui.rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.competence_week.smarthome.databinding.FragmentRoomsBinding
import com.competence_week.smarthome.ui.base.BaseFragment

class RoomsFragment : BaseFragment() {

    private val viewModel: RoomsViewModel by viewModels()
    private var _binding: FragmentRoomsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRoomsBinding.inflate(inflater, container, false)
        return binding.root
    }

}