package com.example.testapp.problem1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.R

class Problem1Activity : AppCompatActivity() {

    // Comparing compound drawable with standalone drawable

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, Problem1Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem1)
    }
}
