package com.projetveille2quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

class Quiz : AppCompatActivity() {

    private var difficulte: String? = null
    private var position = 1
    private var reponseUser: Int? = null
    private var totalQuestions = 20
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        difficulte = intent.getStringExtra("difficulte")

        if (difficulte == "Novice")  {
            setQuestionNovice()
            choixNovice()
        } else if (difficulte == "Inter") {
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
            /*if (reponseUser == listeQuestions!!.get(position - 1).reponse) {
                points++
            }*/
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionNovice()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun choixInter() {
        choix1.setOnClickListener {
            reponseUser = 1
            /*if (reponseUser == listeQuestions!!.get(position - 1).reponse) {
                points++
            }*/
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionInter()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun choixExpert() {
        choix1.setOnClickListener {
            reponseUser = 1
            /*if (reponseUser == listeQuestions!!.get(position - 1).reponse) {
                points++
            }*/
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix2.setOnClickListener {
            reponseUser = 2
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix3.setOnClickListener {
            reponseUser = 3
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
        choix4.setOnClickListener {
            reponseUser = 4
            position++
            when{
                position <= totalQuestions ->{
                    setQuestionExpert()
                }else ->{
                Toast.makeText(this, "Quiz terminé!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}