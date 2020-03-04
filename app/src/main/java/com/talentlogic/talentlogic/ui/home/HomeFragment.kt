package com.talentlogic.talentlogic.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.talentlogic.talentlogic.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private lateinit var homeViewModel: HomeViewModel
lateinit var recyclerView: RecyclerView
    val array = listOf<String>("software devloper", "mean stack developer","project manager","drug inspector","bike racker",
        "network analysist","traveller","wanderlust")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        recycleview()

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView= root.findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = recycleview(array)
//        val textView: TextView = root.findViewById(R.id.abcd)/




        return root
    }
}
