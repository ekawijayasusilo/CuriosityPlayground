package com.example.testapp.problem3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.R

class Problem3Activity : AppCompatActivity() {

    // Checking how Kotlin's private modifier is compiled to its Java equivalent

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, Problem3Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        // Check these Kotlin's classes Java representation
        // DummyInternalClass
    }
}
