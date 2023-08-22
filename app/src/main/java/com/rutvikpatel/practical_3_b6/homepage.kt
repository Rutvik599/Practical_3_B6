package com.rutvikpatel.practical_3_b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
    }

    fun signup(view: View) {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun login(view: View) {
        var intent = Intent(this,Registratiopage::class.java)
        startActivity(intent)
    }
}