package com.example.getfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weightloss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightloss)

        val actionbar = supportActionBar
        actionbar!!.title = "WEIGHT LOSS PLANS"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val mealbtn: Button = findViewById(R.id.wlmealbtn)
        val wlebtn: Button = findViewById(R.id.wlbegbtn)

        mealbtn.setOnClickListener {
            val mlitnt = Intent(this, mealplan::class.java)
            startActivity(mlitnt)
        }
        wlebtn.setOnClickListener {
            val wleitnt = Intent(this, weightlossexercise::class.java)
            startActivity(wleitnt)
        }


    }
}
