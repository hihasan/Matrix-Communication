package com.hihasan.matrix.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MenuFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            CameraFragment()
        } else if (position == 1) {
            ChatsFragment()
        } else {
            CallsFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Chats"
        } else if (position == 1) {
            title = "Rooms"
        } else if (position == 2) {
            title = "Calls"
        }
        return title
    }
}
