package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.editTextName)
        val etEmail = findViewById<EditText>(R.id.editTextEmail)

        button = findViewById(R.id.button)
        button.setOnClickListener {

            val strName = etName.text.toString()
            val strEmail = etEmail.text.toString()

           /* if (strName.isBlank()){

                Toast.makeText(this, "please enter a valid name", Toast.LENGTH_SHORT).show()
            } else if (strEmail.isBlank()){

                Toast.makeText(this, "please enter valid e mail", Toast.LENGTH_SHORT).show()
            }else{

                var intent = Intent(this,secondActivity::class.java)
                intent.putExtra("name",strName)
                startActivity(intent)
            }*/

            when{

                strName.isBlank() -> Toast.makeText(this, "please enter a valid name", Toast.LENGTH_SHORT).show()
                strEmail.isBlank() -> Toast.makeText(this, "please enter valid e mail", Toast.LENGTH_SHORT).show()

            else -> {

            var intent = Intent(this,secondActivity::class.java)
            intent.putExtra("name",strName)
                intent.putExtra("email",strEmail)
            startActivity(intent)

        }}



      /*      if (strName.isNotBlank()){

            var intent = Intent(this,secondActivity::class.java)
            intent.putExtra("name",strName)
            startActivity(intent)
        } else{

                Toast.makeText( this,
                    "please enter a valid name", Toast.LENGTH_SHORT).show()

        }*/
        }

    }




}