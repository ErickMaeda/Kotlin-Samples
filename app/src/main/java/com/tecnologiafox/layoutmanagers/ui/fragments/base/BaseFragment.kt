package com.tecnologiafox.layoutmanagers.ui.fragments.base

import android.support.v4.app.Fragment

abstract class BaseFragment : Fragment() {
    abstract fun getTitle(): String
}