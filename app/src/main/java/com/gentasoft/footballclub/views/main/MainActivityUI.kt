package com.gentasoft.footballclub.views.main

import android.support.v7.widget.LinearLayoutManager
import com.gentasoft.footballclub.activities.MainActivity
import com.gentasoft.footballclub.adapters.ClubAdapter
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.verticalLayout

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
        verticalLayout {
            recyclerView {
                layoutManager = LinearLayoutManager(context)
//                adapter = ClubAdapter()
            }
        }
    }
}