package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_leaderboard.*

class Historique : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historique)

        btn_menu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}