package com.example.getfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class musclegainint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musclegainint)

        val actionbar = supportActionBar
        actionbar!!.title = "muscle gain workout plan"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}