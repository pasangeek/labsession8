package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("name")
        val email = intent.extras?.getString("email")

        val strName = findViewById<TextView>(R.id.textView)

   /*     strName.text = "welcome"+name+"..!"+"\n"+"your e mail address is "+email*/
strName.text = "welcome$name ..!\n your e mail address is : $email"


/*
        if(name?.isNotBlank()== true ){

         strName.text = name

        }else

        strName.text = "No Valid Data"*/
    }
}