package com.example.admin.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class CalculatorActivity : AppCompatActivity() {
    internal var val1 = 0f
    internal var val2 = 0f
    internal var val3 = 0f
    internal var add: Boolean? = false
    internal var sub: Boolean? = false
    internal var mul: Boolean? = false
    internal var div: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        //Find View By ID
        val t1 = findViewById(R.id.EditText) as EditText
        val b1 = findViewById(R.id.button2) as Button
        val b2 = findViewById(R.id.button9) as Button
        val b3 = findViewById(R.id.button10) as Button
        val b4 = findViewById(R.id.button16) as Button
        val b5 = findViewById(R.id.button15) as Button
        val b6 = findViewById(R.id.button14) as Button
        val b7 = findViewById(R.id.button20) as Button
        val b8 = findViewById(R.id.button19) as Button
        val b9 = findViewById(R.id.button18) as Button
        val b0 = findViewById(R.id.button26) as Button
        val b_p = findViewById(R.id.button11) as Button
        val b_mi = findViewById(R.id.button13) as Button
        val b_mu = findViewById(R.id.button17) as Button
        val b_d = findViewById(R.id.button24) as Button
        val b_dot = findViewById(R.id.button25) as Button
        val b_e = findViewById(R.id.button23) as Button
        val b_clear = findViewById(R.id.button27) as Button

        //OnClick Listener
        b1.setOnClickListener { t1.setText(t1.text.toString() + "1") }

        b2.setOnClickListener { t1.setText(t1.text.toString() + "2") }

        b3.setOnClickListener { t1.setText(t1.text.toString() + "3") }

        b4.setOnClickListener { t1.setText(t1.text.toString() + "4") }

        b5.setOnClickListener { t1.setText(t1.text.toString() + "5") }

        b6.setOnClickListener { t1.setText(t1.text.toString() + "6") }

        b7.setOnClickListener { t1.setText(t1.text.toString() + "7") }

        b8.setOnClickListener { t1.setText(t1.text.toString() + "8") }

        b9.setOnClickListener { t1.setText(t1.text.toString() + "9") }

        b0.setOnClickListener { t1.setText(t1.text.toString() + "0") }

        b_dot.setOnClickListener { t1.setText(t1.text.toString() + ".") }

        b_p.setOnClickListener {
            val1 = java.lang.Float.parseFloat(t1.text.toString() + "")
            add = true
            t1.text = null
        }

        b_mi.setOnClickListener {
            val1 = java.lang.Float.parseFloat(t1.text.toString() + "")
            sub = true
            t1.text = null
        }

        b_mu.setOnClickListener {
            val1 = java.lang.Float.parseFloat(t1.text.toString() + "")
            mul = true
            t1.text = null
        }

        b_d.setOnClickListener {
            val1 = java.lang.Float.parseFloat(t1.text.toString() + "")
            div = true
            t1.text = null
        }

        b_e.setOnClickListener(View.OnClickListener {
            val2 = java.lang.Float.parseFloat(t1.text.toString() + "")

            if (add === true) {
                t1.setText((val1 + val2).toString() + "")
                add = false

            }
            if (sub === true) {
                t1.setText((val1 - val2).toString() + "")
                sub = false


            }
            if (mul === true) {
                t1.setText((val1 * val2).toString() + "")
                mul = false

            }
            if (div === true) {
                if (val2 == 0f) {
                    t1.setText("Divide by zero Math error")
                    return@OnClickListener
                }
                t1.setText((val1 / val2).toString() + "")
                div = false

            }
        })

        b_clear.setOnClickListener { t1.text = null }


    }
}
