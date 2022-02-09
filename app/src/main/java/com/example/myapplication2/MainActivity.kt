package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText






class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var id:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById<EditText>(R.id.editTextTextPersonName)
        age=findViewById<EditText>(R.id.editTextTextPersonName2)
        id=findViewById<EditText>(R.id.editTextTextPersonName3)
        button=findViewById(R.id.button2)
        button.setOnClickListener(View.OnClickListener { v->
            val intent=Intent(this,MainActivity3::class.java);
            intent.putExtra("name",name.text.toString())
            intent.putExtra("age",age.text.toString())
            intent.putExtra("ID",id.text.toString())
            startActivity(intent);
        })
    }
}