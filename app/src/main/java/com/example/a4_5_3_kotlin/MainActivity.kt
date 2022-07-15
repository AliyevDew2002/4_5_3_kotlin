package com.example.a4_5_3_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var id:EditText; lateinit var pw:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
         id=findViewById<EditText>(R.id.et_user_id)
         pw=findViewById<EditText>(R.id.et_user_pw)
        var login=findViewById<Button>(R.id.b_user_login)
        login.setOnClickListener{
            startLogin()
        }
    }
    fun startLogin(){
        var intent=Intent(this,MainActivity2::class.java )
        var Login:String="Id="+id.getText().toString()+", Password="+pw.getText().toString()
        intent.putExtra("login",Login)
        startActivity(intent)
    }
}