package com.gentasoft.footballclub.layouts.detail

import android.graphics.Color
import android.view.Gravity
import com.gentasoft.footballclub.activities.DetailActivity
import com.gentasoft.footballclub.models.Club
import org.jetbrains.anko.*

class DetailActivityUI(private val club: Club) : AnkoComponent<DetailActivity> {
    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {

        verticalLayout {
            padding = dip(16)

            imageView(club.imgRsc).lparams(width = wrapContent){
                width = dip(100)
                height = dip(100)
                gravity = Gravity.CENTER
                margin = dip(10)
            }

            textView(club.name){
                textSize = 18f
                textColor = Color.BLACK
            }.lparams(width = wrapContent){
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }

            textView(club.desc){
                textSize = 14f
            }.lparams(width = wrapContent){
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }
        }
    }
}