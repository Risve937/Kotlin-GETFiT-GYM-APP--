package com.example.getfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class weightlossexercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightlossexercise)

        val actionbar = supportActionBar
        actionbar!!.title = "weight loss workout plan"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}