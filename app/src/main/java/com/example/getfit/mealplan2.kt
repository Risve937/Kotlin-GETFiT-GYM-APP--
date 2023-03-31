package com.example.getfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mealplan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mealplan2)

        val actionbar = supportActionBar
        actionbar!!.title = "NUTRITION GUIDE"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}