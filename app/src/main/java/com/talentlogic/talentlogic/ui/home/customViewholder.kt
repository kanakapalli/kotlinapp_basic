package com.talentlogic.talentlogic.ui.home

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.talentlogic.talentlogic.R
import kotlinx.android.synthetic.main.candidate_details.*

class customeVieHolder(val view:View, var title: String) : RecyclerView.ViewHolder(view){
init {
    view.setOnClickListener {
        var aa = view.context
Log.i("Recycler","title $title")
        val intent = Intent(aa, Candiatedeatails::class.java)
        intent.putExtra("titlee",title)
        aa.startActivity(intent)
    }
}
}
 class Candiatedeatails : AppCompatActivity(){

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
setContentView(R.layout.candidate_details)
         val titletext= intent.getStringExtra("titlee")
         textView.text= titletext
     }
}