package com.k.k.playground

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.k.k.playground.R

class OtherActivity :  AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.activity_type).apply {
            text = "その他"
        }
        findViewById<TextView>(R.id.data).apply {
            text = intent.getStringExtra(Intent.EXTRA_PROCESS_TEXT)
        }
    }
}