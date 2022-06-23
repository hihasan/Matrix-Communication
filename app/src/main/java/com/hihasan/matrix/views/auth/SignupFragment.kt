package com.hihasan.matrix.views.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.hihasan.matrix.databinding.FragmentAuthMainBinding
import com.hihasan.matrix.databinding.FragmentSignupBinding
import com.hihasan.matrix.utils.base.BaseFragment

class SignupFragment : BaseFragment() {
    private lateinit var binding : FragmentSignupBinding
    private lateinit var viewModel : AuthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root

        viewModel = ViewModelProvider(this)[AuthViewModel::class.java]

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
//        TODO("Not yet implemented")
    }
}