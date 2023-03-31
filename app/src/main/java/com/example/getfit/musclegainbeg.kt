package com.example.getfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class musclegainbeg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musclegainbeg)

        val actionbar = supportActionBar
        actionbar!!.title = "muscle gain workout plan"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}