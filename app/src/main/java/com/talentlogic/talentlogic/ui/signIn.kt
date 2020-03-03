package com.talentlogic.talentlogic.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.talentlogic.talentlogic.MainActivity
import com.talentlogic.talentlogic.R
import com.talentlogic.talentlogic.ui.home.HomeFragment
import kotlinx.android.synthetic.main.signup.view.*

class signIn: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.talentlogic.talentlogic.R.layout.signup)
        val email:EditText=findViewById(R.id.signupgmail)
        val password : EditText= findViewById(R.id.password)
        val conformPassword : EditText= findViewById(R.id.conformpassword)
        val signupbutton : Button = findViewById(R.id.signupbutton)
        signupbutton.setOnClickListener {
            val Intent =Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}