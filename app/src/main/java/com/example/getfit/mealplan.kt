package com.example.getfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mealplan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mealplan)

        val actionbar = supportActionBar
        actionbar!!.title = "NUTRITION GUIDE"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
}