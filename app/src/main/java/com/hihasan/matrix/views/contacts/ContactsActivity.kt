package com.hihasan.matrix.views.contacts

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import com.hihasan.matrix.R
import com.hihasan.matrix.databinding.ActivitySelectContctBinding
import com.hihasan.matrix.utils.base.BaseActivity
import com.hihasan.matrix.views.initial.MainActivity


class ContactsActivity : BaseActivity() {
    private lateinit var binding : ActivitySelectContctBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectContctBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.backIv.setOnClickListener {
            val intent = Intent(this@ContactsActivity, MainActivity::class.java)
            overridePendingTransition(R.anim.popup_hide, R.anim.popup_hide)
            startActivity(intent)

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(com.hihasan.matrix.R.menu.menu_main, menu)
        return true
    }
}