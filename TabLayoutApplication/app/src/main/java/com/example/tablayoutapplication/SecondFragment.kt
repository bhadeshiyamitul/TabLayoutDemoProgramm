package com.example.tablayoutapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView

class SecondFragment : Fragment() {
    var arryList= arrayListOf<Int>(R.drawable.back,R.drawable.background,R.drawable.download,R.drawable.header,R.drawable.background,R.drawable.imag,R.drawable.images,R.drawable.back)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("Second","Fragment")
        var i=inflater.inflate(R.layout.second_fragment_layout,container,false)
       var gridView=i.findViewById(R.id.grid_view) as GridView


        var customAdapter=CustomGridAdapter(context,arryList)
        gridView.adapter = customAdapter
        return i
    }
}