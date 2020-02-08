package com.example.nettew_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val messege = intent.getStringExtra(EXTRA_MESSAGE);

        val textView = findViewById<TextView>(R.id.textView).apply { text = messege }


    }


}
