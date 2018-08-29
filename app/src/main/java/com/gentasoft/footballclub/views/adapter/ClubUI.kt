package com.gentasoft.footballclub.views.adapter

import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import com.gentasoft.footballclub.R
import org.jetbrains.anko.*

class ClubUI : AnkoComponent<ViewGroup> {

    companion object {
        const val titleView = 1
        const val imageView = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView(R.drawable.img_arsenal) {
                id = imageView
            }.lparams(width = wrapContent) {
                margin = dip(10)
                width = dip(50)
                height = dip(50)
                gravity = Gravity.CENTER

            }

            textView {
                textSize = 18f
                text = "Arsenal FC"
                id = titleView
            }.lparams(width = wrapContent) {
                gravity = Gravity.CENTER
            }
        }
    }
}