package com.example.tablayoutapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class FirstFragment :Fragment() {


    var arryList= arrayListOf<String>("Rajkot","Gandhinagar","Ahmedabad","Surat","Junagadh","Jamnagar","Morabi","Amreli","Baroda","Mumbai","Pune")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("First","Fragment")

        var i=inflater.inflate(R.layout.first_fragment_layout,container,false)

        var listView=i.findViewById(R.id.list_view) as ListView

       var customAdapter=CustomAdapter(context,arryList)
        listView.adapter = customAdapter
        return i


    }
}