package com.gentasoft.footballclub.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.gentasoft.footballclub.models.Club
import com.gentasoft.footballclub.ui.adapter.ClubUI
import org.jetbrains.anko.AnkoContext

class ClubAdapter(private val context: Context, private val clusb: List<Club>, private val listener: (Club) -> Unit) : RecyclerView.Adapter<ClubAdapter.ClubHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubHolder {
        return ClubHolder(ClubUI().createView(AnkoContext.create(parent.context,parent)))
    }

    override fun getItemCount(): Int {
        return clusb.size
    }

    override fun onBindViewHolder(holder: ClubHolder, position: Int) {
        holder.bindClub(clusb[position], listener)
    }


    class ClubHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imageView : ImageView = itemView.findViewById(ClubUI.imageView)
        var titleView : TextView = itemView.findViewById(ClubUI.titleView)

        fun bindClub(club: Club, listener: (Club) -> Unit) {
            Glide.with(itemView.context).load(club.imgRsc).into(imageView)
            titleView.text = club.name
            itemView.setOnClickListener { listener(club) }
        }

    }
}