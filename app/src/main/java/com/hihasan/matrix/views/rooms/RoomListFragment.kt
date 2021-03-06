package com.hihasan.matrix.views.rooms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hihasan.matrix.R
import com.hihasan.matrix.databinding.FragmentListBinding
import com.hihasan.matrix.utils.base.BaseFragment

class RoomListFragment : BaseFragment() {
    private lateinit var binding : FragmentListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }


    private fun initListeners() {
        binding.actionFab.setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_add_24, requireContext().theme))
        binding.animationView.setAnimation(R.raw.room_animation)
        binding.titleTv.text = getString(R.string.rooms)
        binding.bodyTv.text = getString(R.string.rooms_message)
    }

}