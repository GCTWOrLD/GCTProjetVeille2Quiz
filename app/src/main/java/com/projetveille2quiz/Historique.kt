package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_historique.*
import kotlinx.android.synthetic.main.activity_leaderboard.btn_menu

class Historique : AppCompatActivity() {

    private var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historique)

        val databaseHelper: DatabaseHelper = DatabaseHelper(this)
        val resListe: ArrayList<ResultatQuiz> = databaseHelper.afficherHistorique()
        user = intent.getStringExtra("user")

        if (resListe.isNotEmpty() && resListe.size >= 5) {
            his_1.text = resListe.get(0).toString()
            his_2.text = resListe.get(1).toString()
            his_3.text = resListe.get(2).toString()
            his_4.text = resListe.get(3).toString()
            his_5.text = resListe.get(4).toString()
        } else {
            his_1.text = "VIDE ou pas assez de résultats"
            his_2.text = "VIDE ou pas assez de résultats"
            his_3.text = "VIDE ou pas assez de résultats"
            his_4.text = "VIDE ou pas assez de résultats"
            his_5.text = "VIDE ou pas assez de résultats"
        }

        btn_menu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
            finish()
        }
    }
}