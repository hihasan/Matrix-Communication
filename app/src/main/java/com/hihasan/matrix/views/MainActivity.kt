package com.hihasan.matrix.views

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.dialog.MaterialDialogs
import com.hihasan.matrix.R
import com.hihasan.matrix.adapter.MenuFragmentPagerAdapter
import com.hihasan.matrix.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var flag : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        tabSettings()
        settingsMenu()

    }

    private fun settingsMenu(){
        binding.profile.setOnClickListener {
            val dialog = Dialog(this@MainActivity)
            dialog.setContentView(R.layout.menu_layout)
            dialog.show()
        }
    }

    private fun tabSettings() {
        val mAdapter = MenuFragmentPagerAdapter(supportFragmentManager)
        binding.contentMain.viewpager.adapter = mAdapter

        binding.contentMain.viewpager.setCurrentItem(0, true)
        binding.contentMain.viewpager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
//                if (position == 0) {
//                    translateUp()
//                    window.setFlags(
//                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                        WindowManager.LayoutParams.FLAG_FULLSCREEN
//                    )
////                    actionButton.setVisibility(View.GONE)
//                } else if (flag) {
//                    translateDown()
////                    actionButton.setVisibility(View.VISIBLE)
//                }
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

        binding.tabs.setupWithViewPager(binding.contentMain.viewpager)


        // This part of code is adjusting size of camera tab part


//        // This part of code is adjusting size of camera tab part
//        val layout = (binding.tabs.getChildAt(0) as LinearLayout).getChildAt(0) as LinearLayout
//        val layoutParams = layout.layoutParams as LinearLayout.LayoutParams
//        layoutParams.weight = 0.4f // e.g. 0.5f

//        layout.layoutParams = layoutParams
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