package com.hihasan.matrix.views.initial

import android.app.Dialog
import android.app.SearchManager
import android.os.Bundle
import android.view.Menu
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuItemCompat
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.hihasan.matrix.R
import com.hihasan.matrix.adapter.MenuFragmentPagerAdapter
import com.hihasan.matrix.databinding.ActivityMainBinding
import com.hihasan.matrix.databinding.MenuLayoutBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingDialog : MenuLayoutBinding
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
            bindingDialog = MenuLayoutBinding.inflate(layoutInflater)
            dialog.setContentView(bindingDialog.root)

            bindingDialog.close.setOnClickListener{
                dialog.dismiss()
            }

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

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_main, menu)
//
//        val searchView: SearchView =
//            MenuItemCompat.getActionView(menu!!.findItem(R.id.action_search)) as SearchView
//        val searchManager = getSystemService(SEARCH_SERVICE) as SearchManager
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
//
//        return true
//    }


}