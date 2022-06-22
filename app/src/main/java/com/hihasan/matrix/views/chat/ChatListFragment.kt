package com.hihasan.matrix.views.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hihasan.matrix.R
import com.hihasan.matrix.databinding.FragmentListBinding
import com.hihasan.matrix.utils.base.BaseFragment

class ChatListFragment : BaseFragment() {
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
        binding.actionFab.setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_person_add_alt_1_24)   )
    }

}