package com.hihasan.matrix.views.communications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hihasan.matrix.R
import com.hihasan.matrix.databinding.FragmentListBinding
import com.hihasan.matrix.utils.base.BaseFragment

class CommunicationListFragment : BaseFragment() {
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
        binding.actionFab.setImageDrawable(resources.getDrawable(R.drawable.ic_baseline_add_ic_call_24, requireContext().theme))
        binding.animationView.setAnimation(R.raw.call_animation)
        binding.titleTv.text = getString(R.string.calls)
        binding.bodyTv.text = getString(R.string.calls_message)
    }
}