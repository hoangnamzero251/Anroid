package com.example.linkoi.emptyactivity

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.widget.GridView

class bai3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)
        val gv1 = this.findViewById(R.id.gv1) as GridView
        val adapter = customAddapter(this, R.layout.girdview, data )
        gv1.adapter = adapter
    }
    val data : ArrayList<customlayout>
        get(){
            val item_liste : ArrayList<customlayout> = ArrayList<customlayout>()
            item_liste.add(customlayout(R.drawable.bim,"Nguyễn Hoàng Nam","Backend"))
            item_liste.add(customlayout(R.drawable.man,"Huỳnh Minh Mẫn","Leader"))
            item_liste.add(customlayout(R.drawable.minh,"Tống Quang Minh","Mobile Dev"))
            item_liste.add(customlayout(R.drawable.u,"Nguyễn Thị Phương Linh", "Web Dev"))
            item_liste.add(customlayout(R.drawable.linh,"Hoàng Nhật Linh","Designer"))
            return item_liste
        }
}