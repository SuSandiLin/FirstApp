package com.sincava.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var btnPlus: Button
    lateinit var btnMinus: Button
    lateinit var btnMultiple: Button
    lateinit var btnDivide: Button
    lateinit var btnEqual: Button

    var plusFlg: Boolean = false
    var minusFlg: Boolean = false
    var multipleFlg: Boolean = false
    var divideFlg: Boolean = false
    var valOne: Int = 0
    var valTwo: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        btnPlus = findViewById(R.id.btn_add)
        btnMinus = findViewById(R.id.btn_minus)
        btnMultiple = findViewById(R.id.btn_multiple)
        btnDivide = findViewById(R.id.btn_div)
        btnEqual = findViewById(R.id.btn_equ)
    }

    fun showButtonContent(view: View){
        when (view.id) {
            R.id.btn_000 -> {
                textView.append("0")
            }

            R.id.btn_001 -> {
                textView.append("1")
            }

            R.id.btn_002 -> {
                textView.append("2")
            }

            R.id.btn_003 -> {
                textView.append("3")
            }

            R.id.btn_004 -> {
                textView.append("4")
            }

            R.id.btn_005 -> {
                textView.append("5")
            }

            R.id.btn_006 -> {
                textView.append("6")
            }

            R.id.btn_007 -> {
                textView.append("7")
            }

            R.id.btn_008 -> {
                textView.append("8")
            }

            R.id.btn_009 -> {
                textView.append("9")
            }

            R.id.btn_del -> {
                textView.text = ""
            }
        }

        btnPlus.setOnClickListener{
            if (textView.text == null) {
                textView.text = ""
            } else {
                valOne = textView.text.toString().toInt()
                plusFlg = true
                textView.text = null
            }
        }

        btnMinus.setOnClickListener{
            if (textView.text == null) {
                textView.text = ""
            } else {
                valOne = textView.text.toString().toInt()
                minusFlg = true
                textView.text = null
            }
        }

        btnMultiple.setOnClickListener{
            if (textView.text == null) {
                textView.text = ""
            } else {
                valOne = textView.text.toString().toInt()
                multipleFlg = true
                textView.text = null
            }
        }

        btnDivide.setOnClickListener{
            if (textView.text == null) {
                textView.text = ""
            } else {
                valOne = textView.text.toString().toInt()
                divideFlg = true
                textView.text = null
            }
        }

        btnEqual.setOnClickListener{
            valTwo = textView.text.toString().toInt()
            when {
                plusFlg -> {
                    textView.text = (valOne + valTwo).toString()
                    plusFlg = false
                }
                minusFlg -> {
                    textView.text = (valOne - valTwo).toString()
                    minusFlg = false
                }
                multipleFlg -> {
                    textView.text = (valOne * valTwo).toString()
                    multipleFlg = false
                }
                divideFlg -> {
                    textView.text = (valOne / valTwo).toString()
                    divideFlg = false
                }
            }
        }
    }
}