package com.rutvikpatel.practical_3_b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun homepage(view: View) {
        var intent = Intent(this,homepage::class.java)
        startActivity(intent)
    }
}