package com.projetveille2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

class Quiz : AppCompatActivity() {

    private var user: String? = null
    private var difficulte: String? = null
    private var position = 1
    private var reponseUser: Int? = null
    private var totalQuestions = 20
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        user = intent.getStringExtra("user")
        difficulte = intent.getStringExtra("difficulte")

        if (difficulte == "Novice")  {
            setQuestionNovice()
            choixNovice()
        } else if (difficulte == "Intermédiaire") {
            setQuestionInter()
            choixInter()
        } else if (difficulte == "Expert") {
            setQuestionExpert()
            choixExpert()
        }

    }

    private fun setQuestionNovice() {
        val questionsN = Constantes.getQuestionsNovice()
        val question: Question? = questionsN[position -1]
        progress_bar.progress = position
        progress_txt.text = "Question " + position + "/" + questionsN.size
        question_quiz.text = question!!.question
        choix1.text = question.optionA
        choix2.text = question.optionB
        choix3.text = question.optionC
        choix4.text = question.optionD
    }

    private fun setQuestionInter() {
        val questionsI = Constantes.getQuestionsInter()
        val question: Question? = questionsI[position -1]
        progress_bar.progress = position
        progress_txt.text = "Question " + position + "/" + questionsI.size
        question_quiz.text = question!!.question
        choix1.text = question.optionA
        choix2.text = question.optionB
        choix3.text = question.optionC
        choix4.text = question.optionD
    }

    private fun setQuestionExpert()  {
        val questionsE = Constantes.getQuestionsExpert()
        val question: Question? = questionsE[position -1]
        progress_bar.progress = position
        progress_txt.text = "Question " + position + "/" + questionsE.size
        question_quiz.text = question!!.question
        choix1.text = question.optionA
        choix2.text = question.optionB
        choix3.text = question.optionC
        choix4.text = question.optionD
    }

    private fun choixNovice() {
        choix1.setOnClickListener {
            reponseUser = 1
            if (reponseUser == Constantes.getQuestionsNovice()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                    sendIntentNovice()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            if (reponseUser == Constantes.getQuestionsNovice()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                    sendIntentNovice()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            if (reponseUser == Constantes.getQuestionsNovice()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                    sendIntentNovice()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            if (reponseUser == Constantes.getQuestionsNovice()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                    sendIntentNovice()
                }
            }
        }
    }

    private fun choixInter() {
        choix1.setOnClickListener {
            reponseUser = 1
            if (reponseUser == Constantes.getQuestionsInter()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                    sendIntentInter()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            if (reponseUser == Constantes.getQuestionsInter()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                    sendIntentInter()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            if (reponseUser == Constantes.getQuestionsInter()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                    sendIntentInter()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            if (reponseUser == Constantes.getQuestionsInter()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                    sendIntentInter()
                }
            }
        }
    }

    private fun choixExpert() {
        choix1.setOnClickListener {
            reponseUser = 1
            if (reponseUser == Constantes.getQuestionsExpert()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                    sendIntentExpert()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            if (reponseUser == Constantes.getQuestionsExpert()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                    sendIntentExpert()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            if (reponseUser == Constantes.getQuestionsExpert()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                    sendIntentExpert()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            if (reponseUser == Constantes.getQuestionsExpert()[position - 1].reponse) {
                points++
            }
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                    sendIntentExpert()
                }
            }
        }
    }

    private fun sendIntentNovice() {
        val intent = Intent(this, Resultat::class.java)
        intent.putExtra("difficulte", "Novice")
        intent.putExtra("points", points)
        intent.putExtra("user", user)
        startActivity(intent)
        finish()
    }

    private fun sendIntentInter() {
        val intent = Intent(this, Resultat::class.java)
        intent.putExtra("difficulte", "Intermédiaire")
        intent.putExtra("points", points)
        intent.putExtra("user", user)
        startActivity(intent)
        finish()
    }

    private fun sendIntentExpert() {
        val intent = Intent(this, Resultat::class.java)
        intent.putExtra("difficulte", "Expert")
        intent.putExtra("points", points)
        intent.putExtra("user", user)
        startActivity(intent)
        finish()
    }
}