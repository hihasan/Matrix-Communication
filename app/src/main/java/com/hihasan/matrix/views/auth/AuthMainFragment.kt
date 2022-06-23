package com.hihasan.matrix.views.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.hihasan.matrix.R
import com.hihasan.matrix.databinding.FragmentAuthMainBinding
import com.hihasan.matrix.utils.base.BaseFragment

class AuthMainFragment : BaseFragment() {
    private lateinit var binding : FragmentAuthMainBinding
    private lateinit var viewModel: AuthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentAuthMainBinding.inflate(inflater, container, false)
        return binding.root

        viewModel = ViewModelProvider(this)[AuthViewModel::class.java]

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.createAccountBtn.setOnClickListener {
            findNavController().navigate(R.id.action_auth_main_to_signup)
        }
        binding.signInTv.setOnClickListener { findNavController().navigate(R.id.action_auth_main_to_singin) }
    }
}