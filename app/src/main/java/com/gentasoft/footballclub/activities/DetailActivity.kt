package com.gentasoft.footballclub.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gentasoft.footballclub.models.Club
import com.gentasoft.footballclub.ui.detail.DetailActivityUI
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val club = intent.getParcelableExtra<Club>("club")
        DetailActivityUI(club).setContentView(this)

    }
}