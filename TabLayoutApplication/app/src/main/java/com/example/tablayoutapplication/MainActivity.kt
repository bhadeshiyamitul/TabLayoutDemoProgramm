package com.example.tablayoutapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabLayout=findViewById(R.id.tabLayout) as TabLayout
        var viewPager=findViewById(R.id.view_pager) as ViewPager

        var firstTab=tabLayout.newTab()
        firstTab.setText("HOME")
        tabLayout.addTab(firstTab)

        var secondTab=tabLayout.newTab()
        secondTab.setText("EVENT")
        tabLayout.addTab(secondTab)

        var thirdTab=tabLayout.newTab()
        thirdTab.setText("SETTING")
        tabLayout.addTab(thirdTab)



        var viewPagerAdapter=ViewPagerAdapter(getSupportFragmentManager())
        viewPagerAdapter.addFrg(FirstFragment(),"FirstFragment")
        viewPagerAdapter.addFrg(SecondFragment(),"SecondFragment")
        viewPagerAdapter.addFrg(ThirdFragment(),"ThirdFragment")

        viewPager.adapter=viewPagerAdapter
        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem=p0!!.position
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }
        })
    }
}
