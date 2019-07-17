package com.example.tablayoutapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("Third","Fragment")
        var i=inflater.inflate(R.layout.third_fragment_layout,container,false)
        return i
    }
}