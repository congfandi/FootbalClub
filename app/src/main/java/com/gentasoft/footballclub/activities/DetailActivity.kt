package com.gentasoft.footballclub.activities

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import com.gentasoft.footballclub.models.Club
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val club = intent.getParcelableExtra<Club>("club")
        verticalLayout {
            padding = dip(16)

            imageView(club.imgRsc).lparams(width = wrapContent){
                width = dip(100)
                height = dip(100)
                gravity = Gravity.CENTER
                margin = dip(10)
            }

            textView(club?.name){
                textSize = 18f
                textColor = Color.BLACK
            }.lparams(width = wrapContent){
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }

            textView(club?.desc){
                textSize = 14f
            }.lparams(width = wrapContent){
                gravity = Gravity.CENTER
                bottomMargin = dip(10)
            }
        }
    }
}