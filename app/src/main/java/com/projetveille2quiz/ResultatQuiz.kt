package com.projetveille2quiz

class ResultatQuiz (val id: Int, val username: String, val score: Int, val difficulte: String) {
    override fun toString(): String {
        return "$username     $difficulte     $score/20"
    }
}