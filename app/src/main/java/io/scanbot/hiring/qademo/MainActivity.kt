package io.scanbot.hiring.qademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.counter_button).setOnClickListener {
            counter++
            findViewById<TextView>(R.id.counter_label).text = "$counter"
        }
    }
}