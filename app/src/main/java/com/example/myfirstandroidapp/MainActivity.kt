package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener { calculateTip() }
    }


    fun calculateTip(){
        val price = findViewById<EditText>(R.id.price).text.toString().toDouble()

        var tip =
            if(findViewById<RadioButton>(R.id.twenty_percent).isActivated){
                price * 0.2
            }
            else if(findViewById<RadioButton>(R.id.fifteen_percent).isActivated){
                price * 0.15
            }
            else if(findViewById<RadioButton>(R.id.ten_percent).isActivated){
                price * 0.1
            }
            else{
                "ERROR"
            }

        var stringBuilder = StringBuilder()
        stringBuilder.append(resources.getString(R.string.mancia))
        stringBuilder.append(" ")
        stringBuilder.append(tip)

        Log.wtf("Cosa", tip.toString())

        findViewById<TextView>(R.id.tipAmount).text = stringBuilder.toString()

    }
}