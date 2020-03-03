package com.talentlogic.talentlogic.ui.home

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.talentlogic.talentlogic.R

class customeVieHolder(val view:View, var title: String) : RecyclerView.ViewHolder(view){
init {
    view.setOnClickListener {
        var aa = view.context

        val intent = Intent(aa, Candiatedeatails::class.java)
        intent.putExtra("title",title)
        aa.startActivity(intent)
    }
}
}
 class Candiatedeatails : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.candidate_details)
        val text : TextView = findViewById(R.id.textView)
//        title.toString()
        text.text = title.toString()
    }
}