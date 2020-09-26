package kr.co.tjoeun.fragmentviewpager_20200926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyAddressFragment
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyAgeFragment
import kr.co.tjoeun.fragmentviewpager_20200926.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "이름"
            1 -> "나이"
            else -> "거주지"
        }

    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> { MyNameFragment() }
            1 -> { MyAgeFragment() }
            else -> { MyAddressFragment() }
        }

    }

    override fun getCount(): Int {
        return 3
    }
}