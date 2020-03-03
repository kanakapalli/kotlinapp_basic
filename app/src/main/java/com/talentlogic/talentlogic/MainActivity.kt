package com.talentlogic.talentlogic

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.talentlogic.talentlogic.ui.home.recycleview
import com.talentlogic.talentlogic.ui.signIn
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var recyclerView: RecyclerView
        val array = listOf<String>("anurag", "anurag1","anurag2","anurag3","anurag4","anurag5","anurag6","anurag7")
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.fragment_home)
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recycleview(array)
//        setContentView(R.layout.loginform)
//
//        val loginbutton : Button = findViewById(R.id.login_button)
//        val signButton: TextView = findViewById(R.id.sign_button)
//        val email:EditText=findViewById(R.id.usernameET)
//        val password : EditText = findViewById(R.id.passwordET)
//
//        loginbutton.setOnClickListener {
//            if(email.text.toString().isEmpty() || password.text.toString().isEmpty()){
//                Toast.makeText(this,"fill the email/password",Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }
//            Toast.makeText(this,"susscess",Toast.LENGTH_LONG).show()
//
//                setContentView(R.layout.activity_main)
//            val navView: BottomNavigationView = findViewById(R.id.nav_view)
//        val navController = findNavController(R.id.nav_host_fragment)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(setOf(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
//      setupActionBarWithNavController(navController, appBarConfiguration)
//
//     navView.setupWithNavController(navController)
//      }
//        signButton.setOnClickListener {
//            val intent = Intent(this,signIn::class.java)
//            startActivity(intent)
//        }
    }
}
