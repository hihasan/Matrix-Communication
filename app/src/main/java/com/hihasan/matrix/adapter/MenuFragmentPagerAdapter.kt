package com.hihasan.matrix.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hihasan.matrix.views.chat.ChatListFragment
import com.hihasan.matrix.views.communications.CommunicationListFragment
import com.hihasan.matrix.views.rooms.RoomListFragment


class MenuFragmentPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            ChatListFragment()
        } else if (position == 1) {
            RoomListFragment()
        } else {
            CommunicationListFragment()
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
