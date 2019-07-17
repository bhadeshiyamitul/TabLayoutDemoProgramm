package com.example.tablayoutapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm) {

     var mFragmentListTitle=ArrayList<String>()
     var mFragmentList=ArrayList<Fragment>()

    override fun getCount(): Int {
       return mFragmentList.size
    }

    override fun getItem(p0: Int): Fragment {
        return mFragmentList.get(p0)
    }

    fun addFrg(fragment: Fragment,title:String)
    {
        mFragmentListTitle.add(title)
        mFragmentList.add(fragment)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentListTitle.get(position)
    }
}