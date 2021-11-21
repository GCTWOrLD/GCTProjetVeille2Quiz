package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_leaderboard.*
import kotlinx.android.synthetic.main.activity_leaderboard.btn_menu

class Leaderboard : AppCompatActivity() {

    private var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)

        val databaseHelper: DatabaseHelper = DatabaseHelper(this)
        val resListe: ArrayList<ResultatQuiz> = databaseHelper.afficherLeaderboard()
        user = intent.getStringExtra("user")

        if (resListe.isNotEmpty() && resListe.size >= 5) {
            lb_1.text = "1. " + resListe.get(0).toString()
            lb_2.text = "2. " + resListe.get(1).toString()
            lb_3.text = "3. " + resListe.get(2).toString()
            lb_4.text = "4. " + resListe.get(3).toString()
            lb_5.text = "5. " + resListe.get(4).toString()
        } else {
            lb_1.text = "1. VIDE ou pas assez de résultats"
            lb_2.text = "2. VIDE ou pas assez de résultats"
            lb_3.text = "3. VIDE ou pas assez de résultats"
            lb_4.text = "4. VIDE ou pas assez de résultats"
            lb_5.text = "5. VIDE ou pas assez de résultats"
        }

        btn_menu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
            finish()
        }
    }
}