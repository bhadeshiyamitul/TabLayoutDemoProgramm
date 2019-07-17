package com.example.tablayoutapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView

class CustomGridAdapter() :BaseAdapter() {

     var context:Context?=null
    lateinit var gridImageList:ArrayList<Int>

    constructor(context: Context?,gridImageList:ArrayList<Int>):this()
    {
        this.context=context
        this.gridImageList=gridImageList
    }

    override fun getCount(): Int {
        return gridImageList.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var row=LayoutInflater.from(context).inflate(R.layout.custom_grid,parent,false)

        var gridImage=row.findViewById(R.id.grid_img) as ImageView

        var i=gridImageList.get(position).toInt()
        gridImage.setImageResource(i)
        return row

    }
}