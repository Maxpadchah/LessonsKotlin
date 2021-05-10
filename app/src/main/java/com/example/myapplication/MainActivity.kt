package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var logo : TextView
    lateinit var user_input_field : EditText
    lateinit var user_button : MaterialButton
    lateinit var field_information : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializationField()
        user_button.setOnClickListener {
            Toast.makeText(applicationContext, user_input_field.getText().toString(), Toast.LENGTH_LONG).show()
            field_information.setText(user_input_field.getText().toString())
        }
    }
    fun initializationField() {
        logo = findViewById(R.id.logo)
        user_input_field = findViewById(R.id.user_input_field)
        user_button = findViewById(R.id.user_button)
        field_information = findViewById(R.id.field_information)
    }

}