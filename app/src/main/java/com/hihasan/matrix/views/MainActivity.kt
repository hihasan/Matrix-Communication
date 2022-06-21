package com.hihasan.matrix.views

import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.hihasan.matrix.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var flag : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun translateUp() {
        val up: Animation = TranslateAnimation(0F, 0F, 0F, -280F)
        binding.appBar.animation = up
        up.duration = 150
        up.fillAfter = true
        up.start()
        flag = true
    }

    private fun translateDown() {
        val up: Animation = TranslateAnimation(0F, 0F, -280F, 0F)
        binding.appBar.animation = up
        up.duration = 150
        up.fillAfter = true
        up.start()
        flag = false
        window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}