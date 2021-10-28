package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {

    private var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        user = intent.getStringExtra(Constantes.USER)
        nom_user.text = "Bonjour " + user + " !"

        btn_novice.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            intent.putExtra("difficulte", "Novice")
            startActivity(intent)
            finish()
        }

        btn_inter.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            intent.putExtra("difficulte", "Inter")
            startActivity(intent)
            finish()
        }

        btn_expert.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            intent.putExtra("difficulte", "Expert")
            startActivity(intent)
            finish()
        }

        btn_lb.setOnClickListener {
            val intent = Intent(this, Leaderboard::class.java)
            startActivity(intent)
            finish()
        }

        btn_hist.setOnClickListener {
            val intent = Intent(this, Historique::class.java)
            startActivity(intent)
            finish()
        }
    }
}