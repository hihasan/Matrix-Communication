package com.hihasan.matrix.views.auth

import android.os.Bundle
import com.hihasan.matrix.databinding.ActivityAuthBinding
import com.hihasan.matrix.utils.base.BaseActivity

class AuthActivity : BaseActivity() {
    private lateinit var binding : ActivityAuthBinding
    private lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}