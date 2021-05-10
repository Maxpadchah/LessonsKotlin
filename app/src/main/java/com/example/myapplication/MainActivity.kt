package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.bt_button)
        button.setOnClickListener {
            var toast = Toast.makeText(applicationContext, "Нажата кнопка!", LENGTH_SHORT).show()
        }

        textView1 = findViewById(R.id.tV_text1)
        textView2 = findViewById(R.id.tV_text2)
        textView3 = findViewById(R.id.tV_text3)
        textView4 = findViewById(R.id.tV_text4)

        var myDataClass = MyDataClass("Red", "While")
        val copy = myDataClass.copy("Blue", "Red")
        var myClass1 = MyClass1()

        textView1.setText(myDataClass.toString())
        textView2.setText(myClass1.output1())
        textView3.setText(myClass1.output2())
        textView4.setText(copy.toString())


    }
}

data class MyDataClass(val color1: String, val color2: String) {}

class MyClass1 {
    fun output1(): String {
        var name = ""
        for (i in 1..3) {
            name = name + "Hello Kotlin!" + " " + i + "\n"
        }
        return name
    }

    fun output2(): String {
        var name = ""
        for (i in 6 downTo 1 step 2) {
            name = name + "Hello Kotlin!" + " " + i + "\n"
        }
        return name
    }
}




