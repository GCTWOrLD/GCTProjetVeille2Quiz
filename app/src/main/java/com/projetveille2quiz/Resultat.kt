package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_resultat.*

class Resultat : AppCompatActivity() {

    private var difficulte: String? = null
    private var points: Int? = null
    private var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultat)

        difficulte = intent.getStringExtra("difficulte")
        points = intent.getIntExtra("points", 0)
        user = intent.getStringExtra("user")

        val img = ImageView(this)

        if (points!!.toInt() >= 12) {
            res_user.text = "Bravo " + user + "!"
            res_img.setImageResource(R.drawable.clap);
        }else {
            res_user.text = "Désolé " + user + " :("
            res_img.setImageResource(R.drawable.thumbsdown);
        }
        res_diff.text = "Difficulté: " + difficulte
        res_score.text = points.toString() + " / 20"

        res_start.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}