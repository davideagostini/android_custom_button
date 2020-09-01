package com.custombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun btn1Clicked(view: View) {
        Toast.makeText(applicationContext, "Button 1 clicked", Toast.LENGTH_SHORT).show()
    }

    fun btn2Clicked(view: View) {
        Toast.makeText(applicationContext, "Button 2 clicked", Toast.LENGTH_SHORT).show()
    }
}