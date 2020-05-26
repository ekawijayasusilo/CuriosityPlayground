package com.example.testapp.problem2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.R

class Problem2Activity : AppCompatActivity() {

    // Trying Smartcast on non final properties

    val dummyCompositionClass = DummyCompositionClass()

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, Problem2Activity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        if (dummyCompositionClass.dummyParentClass is DummyChildClass) {
            // Smartcast not possible if a property is mutable or has open/custom getter
            // dummyCompositionClass.dummyParentClass.checkTypeChild()
        }
    }
}
