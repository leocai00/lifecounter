package edu.washington.wanxic.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lifeCount1: TextView = findViewById(R.id.lifeCount1)
        var button11: Button = findViewById(R.id.button11)
        var button12: Button = findViewById(R.id.button12)
        var button13: Button = findViewById(R.id.button13)
        var button14: Button = findViewById(R.id.button14)

        var lifeCount2: TextView = findViewById(R.id.lifeCount2)
        var button21: Button = findViewById(R.id.button21)
        var button22: Button = findViewById(R.id.button22)
        var button23: Button = findViewById(R.id.button23)
        var button24: Button = findViewById(R.id.button24)

        var lifeCount3: TextView = findViewById(R.id.lifeCount3)
        var button31: Button = findViewById(R.id.button31)
        var button32: Button = findViewById(R.id.button32)
        var button33: Button = findViewById(R.id.button33)
        var button34: Button = findViewById(R.id.button34)

        var lifeCount4: TextView = findViewById(R.id.lifeCount4)
        var button41: Button = findViewById(R.id.button41)
        var button42: Button = findViewById(R.id.button42)
        var button43: Button = findViewById(R.id.button43)
        var button44: Button = findViewById(R.id.button44)

        var lose: TextView = findViewById(R.id.lose)

        button11.setOnClickListener {
            var currentCount = lifeCount1.text.toString().toInt()
            var count = plusOne(currentCount)
            lifeCount1.text = count.toString()
            lose.text = result(1, count)
        }

        button12.setOnClickListener {
            var currentCount = lifeCount1.text.toString().toInt()
            var count = minusOne(currentCount)
            lifeCount1.text = count.toString()
            lose.text = result(1, count)
        }

        button13.setOnClickListener {
            var currentCount = lifeCount1.text.toString().toInt()
            var count = plusFive(currentCount)
            lifeCount1.text = count.toString()
            lose.text = result(1, count)
        }

        button14.setOnClickListener {
            var currentCount = lifeCount1.text.toString().toInt()
            var count = minusFive(currentCount)
            lifeCount1.text = count.toString()
            lose.text = result(1, count)
        }

        button21.setOnClickListener {
            var currentCount = lifeCount2.text.toString().toInt()
            var count = plusOne(currentCount)
            lifeCount2.text = count.toString()
            lose.text = result(2, count)
        }

        button22.setOnClickListener {
            var currentCount = lifeCount2.text.toString().toInt()
            var count = minusOne(currentCount)
            lifeCount2.text = count.toString()
            lose.text = result(2, count)
        }

        button23.setOnClickListener {
            var currentCount = lifeCount2.text.toString().toInt()
            var count = plusFive(currentCount)
            lifeCount2.text = count.toString()
            lose.text = result(2, count)
        }

        button24.setOnClickListener {
            var currentCount = lifeCount2.text.toString().toInt()
            var count = minusFive(currentCount)
            lifeCount2.text = count.toString()
            lose.text = result(2, count)
        }

        button31.setOnClickListener {
            var currentCount = lifeCount3.text.toString().toInt()
            var count = plusOne(currentCount)
            lifeCount3.text = count.toString()
            lose.text = result(3, count)
        }

        button32.setOnClickListener {
            var currentCount = lifeCount3.text.toString().toInt()
            var count = minusOne(currentCount)
            lifeCount3.text = count.toString()
            lose.text = result(3, count)
        }

        button33.setOnClickListener {
            var currentCount = lifeCount3.text.toString().toInt()
            var count = plusFive(currentCount)
            lifeCount3.text = count.toString()
            lose.text = result(3, count)
        }

        button34.setOnClickListener {
            var currentCount = lifeCount3.text.toString().toInt()
            var count = minusFive(currentCount)
            lifeCount3.text = count.toString()
            lose.text = result(3, count)
        }

        button41.setOnClickListener {
            var currentCount = lifeCount4.text.toString().toInt()
            var count = plusOne(currentCount)
            lifeCount4.text = count.toString()
            lose.text = result(4, count)
        }

        button42.setOnClickListener {
            var currentCount = lifeCount4.text.toString().toInt()
            var count = minusOne(currentCount)
            lifeCount4.text = count.toString()
            lose.text = result(4, count)
        }

        button43.setOnClickListener {
            var currentCount = lifeCount4.text.toString().toInt()
            var count = plusFive(currentCount)
            lifeCount4.text = count.toString()
            lose.text = result(4, count)
        }

        button44.setOnClickListener {
            var currentCount = lifeCount4.text.toString().toInt()
            var count = minusFive(currentCount)
            lifeCount4.text = count.toString()
            lose.text = result(4, count)
        }
    }

    private fun plusOne(i: Int): Int {
        return i + 1
    }

    private fun minusOne(i: Int): Int {
        return i - 1
    }

    private fun plusFive(i: Int): Int {
        return i + 5
    }

    private fun minusFive(i: Int): Int {
        return i - 5
    }

    private fun result(player: Int, count: Int): String {
        if(count <= 0) {
            return "Player " + player + " LOSES!"
        }
        return ""
    }
}
