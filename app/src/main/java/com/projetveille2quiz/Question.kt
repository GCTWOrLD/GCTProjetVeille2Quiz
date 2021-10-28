package com.projetveille2quiz

data class Question (
    val id: Int,
    val difficulte: String,
    val question: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val reponse: Int
)
