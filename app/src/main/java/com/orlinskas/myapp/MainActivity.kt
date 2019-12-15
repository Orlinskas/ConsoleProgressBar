package com.orlinskas.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.orlinskas.consoleprogressbar.ConsoleProgressBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ConsoleProgressBar>(R.id.activity_main_console_progress_bar)

        //settings
        progressBar.setColor(resources.getColor(R.color.colorAccent))
        progressBar.setStrokeWidth(15f)

        // active management
        progressBar.start()
        progressBar.stop()

        //or
        progressBar.intermediate(true)
    }
}
