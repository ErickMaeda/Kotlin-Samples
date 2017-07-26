package com.tecnologiafox.layoutmanagers.ui.adapter.viewpager

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.tecnologiafox.layoutmanagers.ui.fragments.base.BaseFragment

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var baseFragmentList: MutableList<BaseFragment> = mutableListOf()

    override fun getItem(position: Int) = baseFragmentList[position]

    override fun getCount() = baseFragmentList.size

    override fun getPageTitle(position: Int) = baseFragmentList[position].getTitle()

    fun addFragment(fragment: BaseFragment) = baseFragmentList.add(fragment)

    fun addFragments(fragment: Array<BaseFragment>) = baseFragmentList.addAll(fragment)
}