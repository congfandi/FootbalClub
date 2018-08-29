package com.gentasoft.footballclub.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.gentasoft.footballclub.R
import com.gentasoft.footballclub.adapters.ClubAdapter
import com.gentasoft.footballclub.models.Club
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainView().setContentView(this)
    }


    class MainView : AnkoComponent<MainActivity> {
        var clubs = mutableListOf<Club>()
        private fun loadData(){
            clubs.add(Club(1,"AC Milan FC", R.drawable.img_acm,"Club Sepak Bola AC milan FC"))
            clubs.add(Club(1,"Arsenal FC", R.drawable.img_arsenal,"Club Sepak Bola Arsenal FC"))
            clubs.add(Club(1,"Barcelona FC", R.drawable.img_barca,"Club Sepak Bola  Barcelona FC"))
            clubs.add(Club(1,"Bayer Munchen FC", R.drawable.img_bayern,"Club Sepak Bola Bayer milan FC"))
            clubs.add(Club(1,"Chelsea FC", R.drawable.img_chelsea,"Club Sepak Bola  Chelsea FC"))
            clubs.add(Club(1,"Man City FC", R.drawable.img_city,"Club Sepak Bola  City FC"))
            clubs.add(Club(1,"Real Madrid FC", R.drawable.img_madrid,"Club Sepak Bola  Madrid FC"))
            clubs.add(Club(1,"Man United FC", R.drawable.img_mu,"Club Sepak Bola Man United FC"))
        }
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            loadData()
            verticalLayout {
                padding = dip(16)
                recyclerView {
                    layoutManager = LinearLayoutManager(context)
                    adapter = ClubAdapter(context,clubs){
                       val intent = Intent(context,DetailActivity::class.java)
                        intent.putExtra("club",it)
                        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
                        context.startActivity(intent)
                    }

                }
            }
        }
    }
}
