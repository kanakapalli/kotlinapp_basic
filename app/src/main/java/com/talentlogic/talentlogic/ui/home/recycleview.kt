package com.talentlogic.talentlogic.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.talentlogic.talentlogic.R
import kotlinx.android.synthetic.main.clentdeails_adp.view.*

class recycleview(val array: List<String>) : RecyclerView.Adapter<customeVieHolder>(){
    override fun getItemCount(): Int {
    return array.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customeVieHolder {
        val layout_inflator = LayoutInflater.from(parent?.context)
        val cellrow = layout_inflator.inflate(R.layout.clentdeails_adp,parent,false)
        return customeVieHolder(cellrow, "ff")
    }

    override fun onBindViewHolder(holder: customeVieHolder, position: Int) {
        holder?.view?.clientname.text= array.get(position).toUpperCase()
        holder?.title = array.get(position)



    }



}