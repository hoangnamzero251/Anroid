package com.example.linkoi.emptyactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signinbtn.setOnClickListener {
            val intent: Intent = Intent(this, bai2::class.java)
            startActivity(intent)
        }
    }
}