package com.Harsh.task9jan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var numbertext :TextView? = null
var btnAdd :Button? = null
var btnSub :Button? = null
var btnMul :Button? = null
var btnDiv :Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numbertext = findViewById(R.id.tvCenter)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSubtract)
        btnMul = findViewById(R.id.btnMultiplication)
        btnDiv = findViewById(R.id.btnDivide)



        btnAdd?.setOnClickListener(){
            var getnum = numbertext?.text.toString().toInt()
            getnum++
            numbertext?.setText(getnum.toString())

        }

        btnSub?.setOnClickListener(){
            var getnum = numbertext?.text.toString().toInt()
            getnum--
            numbertext?.setText(getnum.toString())

        }
        btnMul?.setOnClickListener(){
            var getnum = numbertext?.text.toString().toInt()
            getnum *= getnum
            numbertext?.setText(getnum.toString())
        }
        btnDiv?.setOnClickListener(){
            var getnum = numbertext?.text.toString().toInt()
            getnum /= getnum
            numbertext?.setText(getnum.toString())
        }
        
    }
}