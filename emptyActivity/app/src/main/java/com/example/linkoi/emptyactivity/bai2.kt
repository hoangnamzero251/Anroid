package com.example.linkoi.emptyactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bai2.*

class bai2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)
        loginbtn.setOnClickListener {
            val intent: Intent = Intent(this, bai3::class.java)
            startActivity(intent)
        }
    }
}