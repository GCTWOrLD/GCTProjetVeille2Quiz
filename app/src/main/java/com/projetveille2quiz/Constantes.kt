package com.projetveille2quiz

object Constantes {

    const val USER: String = "username"

    fun getQuestionsNovice(): ArrayList<Question>{
        val listeQuestionsNovice = ArrayList<Question>()

        val q1 = Question(
            1,
            "Novice",
            "Lequel de ces personnages n'est pas ami avec Harry Potter?",
            "Ron Weasley",
            "Neville Longbottom",
            "Draco Malfoy",
            "Hermione Granger",
            3
        )

        listeQuestionsNovice.add(q1)
        return listeQuestionsNovice
    }

    fun getQuestionsInter(): ArrayList<Question>{
        val listeQuestionsInter = ArrayList<Question>()

        val q1 = Question(
            1,
            "Intermédiaire",
            "Quelle est la vitesse du son?",
            "120 km/h",
            "1200 km/h",
            "400 km/h",
            "700 km/h",
            2
        )

        listeQuestionsInter.add(q1)
        return listeQuestionsInter
    }

    fun getQuestionsExpert(): ArrayList<Question>{
        val listeQuestionsExpert = ArrayList<Question>()

        val q1 = Question(
            1,
            "Expert",
            "À quelle date le musée du Louvre a-t-il officiellement ouvert ses portes ?",
            "26 mai 1650",
            "3 octobre 1801",
            "15 janvier 1872",
            "10 août 1793",
            4
        )

        listeQuestionsExpert.add(q1)
        return listeQuestionsExpert
    }
}