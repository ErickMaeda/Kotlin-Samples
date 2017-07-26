package com.tecnologiafox.layoutmanagers.ui.activities

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.tecnologiafox.layoutmanagers.R
import com.tecnologiafox.layoutmanagers.ui.adapter.viewpager.ViewPagerAdapter
import com.tecnologiafox.layoutmanagers.ui.fragments.MoviesFragment
import com.tecnologiafox.layoutmanagers.ui.fragments.ActorsFragment
import com.tecnologiafox.layoutmanagers.ui.fragments.DirectorsFragment

class MainActivity : AppCompatActivity() {

    private val toolbar by lazy { findViewById(R.id.toolbar) as Toolbar }
    private val tabLayout by lazy { findViewById(R.id.tab_layout) as TabLayout }
    private val viewPager by lazy { findViewById(R.id.view_pager) as ViewPager }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        setSupportActionBar(toolbar)
        setupViewPager(viewPager)
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragments(arrayOf(MoviesFragment(), ActorsFragment(), DirectorsFragment()))
        viewPager.adapter = adapter
    }
}
