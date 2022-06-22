package com.hihasan.matrix.views.contacts

import android.os.Bundle
import android.view.Menu
import com.hihasan.matrix.databinding.ActivitySelectContctBinding
import com.hihasan.matrix.utils.base.BaseActivity


class ContactsActivity : BaseActivity() {
    private lateinit var binding : ActivitySelectContctBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectContctBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(com.hihasan.matrix.R.menu.menu_main, menu)
        // Retrieve the SearchView and plug it into SearchManager
//        val searchView: SearchView =
//            MenuItemCompat.getActionView(menu.findItem(R.id.action_search)) as SearchView
//        val searchManager = getSystemService(SEARCH_SERVICE) as SearchManager
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        return true
    }
}