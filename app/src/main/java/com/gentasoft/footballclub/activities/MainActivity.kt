package com.gentasoft.footballclub.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gentasoft.footballclub.layouts.main.MainActivityUI
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }
}
