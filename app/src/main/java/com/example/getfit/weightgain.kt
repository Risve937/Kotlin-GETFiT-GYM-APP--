package com.example.getfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weightgain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightgain)

        val actionbar = supportActionBar
        actionbar!!.title = "MUSCLE GAIN PLANS"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val meal2btn: Button = findViewById(R.id.meal2btn)
        val mclgbtn: Button = findViewById(R.id.wgbegbtn)
        val mclgbtnx: Button = findViewById(R.id.wgintbtn)

        meal2btn.setOnClickListener {
            val ml2itnt = Intent(this, mealplan2::class.java)
            startActivity(ml2itnt)
        }

        mclgbtn.setOnClickListener {
            val mclgbtn2 = Intent(this, musclegainbeg::class.java)
            startActivity(mclgbtn2)
        }

        mclgbtnx.setOnClickListener {
            val mclgbtn3 = Intent(this, musclegainint::class.java)
            startActivity(mclgbtn3)
        }


    }
}