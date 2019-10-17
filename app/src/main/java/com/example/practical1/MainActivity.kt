package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {

        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

        val resultText2: TextView = findViewById(R.id.result_text2)
        val randomInt2 = Random().nextInt(6) + 1
        resultText2.text = randomInt2.toString()

        val resultText3: TextView = findViewById(R.id.result_text3)
        val randomInt3 = Random().nextInt(6) + 1
        resultText3.text = randomInt3.toString()
    }

    private fun countUp() {

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if (resultText.text == "Hello World!") {

            resultText.text = "1"
        }

        else {

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {

                resultInt++
                resultText.text = resultInt.toString()
            }
        }

        if (resultText2.text == "Hello World!") {

            resultText2.text = "1"
        }

        else {

            var resultInt = resultText2.text.toString().toInt()

            if (resultInt < 6) {

                resultInt++
                resultText2.text = resultInt.toString()
            }
        }

        if (resultText3.text == "Hello World!") {

            resultText3.text = "1"
        }

        else {

            var resultInt = resultText3.text.toString().toInt()

            if (resultInt < 6) {

                resultInt++
                resultText3.text = resultInt.toString()
            }
        }
    }
}
