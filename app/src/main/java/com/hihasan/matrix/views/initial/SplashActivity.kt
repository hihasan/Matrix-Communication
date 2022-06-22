package com.hihasan.matrix.views.initial

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.lifecycle.ViewModelProvider
import com.hihasan.matrix.databinding.ActivitySplashBinding
import com.hihasan.matrix.utils.base.BaseActivity

class SplashActivity : BaseActivity() {
    private lateinit var binding : ActivitySplashBinding
    private lateinit var viewModel : InitialViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[InitialViewModel::class.java]

        initListeners()
    }

    private fun initListeners() {
        screen()

        viewModel.waitScreen(applicationContext)
    }

    private fun screen() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }
}