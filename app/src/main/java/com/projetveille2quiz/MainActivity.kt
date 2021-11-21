package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.github.muddz.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_menu.setOnClickListener {
            if (nom_user.text.toString().isEmpty()){
                StyleableToast.makeText(this, "Vous devez entrer votre nom!", Toast.LENGTH_SHORT, R.style.failToast).show();
            }else {
                val intent = Intent(this, Menu::class.java)
                intent.putExtra("user", nom_user.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}