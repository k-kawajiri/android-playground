package com.k.k.playground

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.k.k.playground.R

class TelActivity :  AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.activity_type).apply {
            text = "電話番号"
        }
        findViewById<TextView>(R.id.data).apply {
            text = intent.dataString
        }
    }
}