package com.example.testapp

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.problem1.Problem1Activity
import com.example.testapp.problem2.Problem2Activity
import com.example.testapp.problem3.Problem3Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton("Compound Drawable") {
            Problem1Activity.startActivity(this)
        }

        addButton("Kotlin Smartcast") {
            Problem2Activity.startActivity(this)
        }

        addButton("Kotlin Modifier") {
            Problem3Activity.startActivity(this)
        }

    }

    private fun addButton(text: String, action: () -> Unit) {
        val newButton = Button(this)
        val layoutParam = ViewGroup.MarginLayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(8, 8, 8, 8)
        }
        newButton.layoutParams = layoutParam
        newButton.text = text
        newButton.setOnClickListener { action() }

        linear_layout_buttons.addView(newButton)
    }
}
