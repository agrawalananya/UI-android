package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    lateinit var name:String
    lateinit var age:String
    lateinit var id:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        name=intent.getStringExtra("name")!!
        age=intent.getStringExtra("age")!!
        id=intent.getStringExtra("ID")!!

        //print(name + age +id)
        Toast.makeText(this, "ame + age +id", Toast.LENGTH_SHORT).show()
    }


}