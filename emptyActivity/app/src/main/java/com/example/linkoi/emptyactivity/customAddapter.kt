package com.example.linkoi.emptyactivity

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class customAddapter (private val getContext: Context, private val CustomLayoutId : Int, private val customItem: ArrayList<customlayout>)
    : ArrayAdapter<customlayout>(getContext, CustomLayoutId, customItem) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var row = convertView
        val Holder: ViewHolder
        if(row==null){
            val inflater = (getContext as Activity).layoutInflater
            row = inflater!!.inflate(CustomLayoutId, parent, false)
            Holder = ViewHolder()
            Holder.img = row!!.findViewById(R.id.imv) as ImageView
            Holder.txt1 = row!!.findViewById(R.id.tv1) as TextView
            Holder.txt2 = row!!.findViewById(R.id.tv2) as TextView
            row.setTag(Holder)
        }else{
            Holder=row.getTag() as ViewHolder
        }
        val item = customItem[position]
        Holder.img!!.setImageResource(item.pic)
        Holder.txt1!!.setText(item.name)
        Holder.txt2!!.setText(item.chucvu)
        return row
    }
    class ViewHolder{
        internal var img: ImageView? = null
        internal var txt1: TextView? = null
        internal var txt2: TextView? = null
    }
}