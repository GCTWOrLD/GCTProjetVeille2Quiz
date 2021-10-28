package com.projetveille2quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz.*

class Quiz : AppCompatActivity() {

    private var difficulte: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        difficulte = intent.getStringExtra("difficulte")

        if (difficulte == "Novice")  {
            diff_quiz.text = "Novice"
            val questions = Constantes.getQuestionsNovice()
            question_quiz.text = Constantes.getQuestionsNovice().get(0).question
            // Test qui montre que la difficulté est Novice
            Log.i("Test Difficulté", "${questions.get(0).difficulte}")
        } else if (difficulte == "Inter") {
            diff_quiz.text = "Intermédiaire"
            val questions = Constantes.getQuestionsInter()
            question_quiz.text = Constantes.getQuestionsInter().get(0).question
            // Test qui montre que la difficulté est Intermédiaire
            Log.i("Test Difficulté", "${questions.get(0).difficulte}")
        } else if (difficulte == "Expert") {
            diff_quiz.text = "Expert"
            val questions = Constantes.getQuestionsExpert()
            question_quiz.text = Constantes.getQuestionsExpert().get(0).question
            // Test qui montre que la difficulté est Expert
            Log.i("Test Difficulté", "${questions.get(0).difficulte}")
        }
    }
}