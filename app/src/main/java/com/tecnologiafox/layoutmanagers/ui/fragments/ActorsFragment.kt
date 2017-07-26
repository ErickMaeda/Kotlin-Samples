package com.tecnologiafox.layoutmanagers.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tecnologiafox.layoutmanagers.R
import com.tecnologiafox.layoutmanagers.ui.fragments.base.BaseFragment

class ActorsFragment : BaseFragment() {

    override fun getTitle(): String = ActorsFragment::class.java.simpleName

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?) = inflater?.inflate(R.layout.fragment_linear, container, false)

}