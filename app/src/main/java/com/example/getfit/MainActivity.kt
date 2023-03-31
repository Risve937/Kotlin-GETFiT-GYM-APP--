package com.example.getfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val wlbtn: Button = findViewById(R.id.wlpbtn)
        val wgbtn: Button = findViewById(R.id.wgpbtn)

        wlbtn.setOnClickListener {
            val litnt = Intent(this, weightloss::class.java)
            startActivity(litnt)
        }
        wgbtn.setOnClickListener {
            val gitnt = Intent(this, weightgain::class.java)
            startActivity(gitnt)
        }



        val imale = findViewById<ImageView>(R.id.imale)
        val ifemale = findViewById<ImageView>(R.id.ifeamle)
        val weight = findViewById<EditText>(R.id.editTextNumberDecimal)
        val height = findViewById<EditText>(R.id.editTextNumberDecimal3)

        val bmibtn: Button =findViewById(R.id.materialButton)

        val bmi = findViewById<TextView>(R.id.textView10)
        val bmistatus = findViewById<TextView>(R.id.textView9)
        val bmiview = findViewById<LinearLayout>(R.id.bmiview)
        val clag = findViewById<TextView>(R.id.textView11)

        imale.setOnClickListener {
            imale.setImageResource(R.drawable.ic_male)
            ifemale.setImageResource(R.drawable.ic_female_blur)
        }
        ifemale.setOnClickListener {
            ifemale.setImageResource(R.drawable.ic_male_blur)
            imale.setImageResource(R.drawable.ic_female)
        }

        bmibtn.setOnClickListener{
            var weightvalue =0.0
            var heightvalue =0.0
            if (weight.text.toString().isNotEmpty()){
                weightvalue=weight.text.toString().toDouble()
            }
            if (height.text.toString().isNotEmpty()){
                heightvalue=(height.text.toString().toDouble()/100)
            }
            if(weightvalue>0.0 && heightvalue>0.0){
                val bmivalue = String.format("%.2f", weightvalue/heightvalue.pow(2))
                bmi.text= bmivalue
                bmistatus.text = bmistval(weightvalue/heightvalue.pow(2))
                bmiview.visibility = VISIBLE
                bmibtn.visibility = GONE
            }
            Toast.makeText(this,"Please input weight nad height > 0", Toast.LENGTH_SHORT).show()
        }
        clag.setOnClickListener {
            bmiview.visibility = GONE
            bmibtn.visibility = VISIBLE
            weight.text.clear()
            height.text.clear()
            weight.requestFocus()
        }

    }
    private fun bmistval(bmi:Double):String {
        lateinit  var bmistat:  String
        if(bmi<18.5){
            bmistat = "Underweight \n Go for muscle gain"
        }
        else if(bmi>=18.5 && bmi<24.9){
            bmistat = "Normal weight\nmaintain your regular physical activity"
        }
        else if(bmi>24.9) {
            bmistat = "Overweight \n Go for weight loss"
        }
        return bmistat
    }
}