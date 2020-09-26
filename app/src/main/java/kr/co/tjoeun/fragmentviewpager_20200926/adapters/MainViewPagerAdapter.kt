package kr.co.tjoeun.fragmentviewpager_20200926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyAddressFragment
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyAgeFragment
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return MyNameFragment()
        }
        else if (position == 1) {
            return MyAgeFragment()
        }
        else {
            return MyAddressFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }
}