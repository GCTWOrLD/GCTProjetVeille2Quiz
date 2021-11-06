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

        val q2 = Question(
            2,
            "Novice",
            "Lequel de ces animaux est le plus rapide?",
            "Guépard",
            "Léopard",
            "Tigre",
            "Lion",
            1
        )

        listeQuestionsNovice.add(q2)

        val q3 = Question(
            3,
            "Novice",
            "D'où viennent les pouvoirs de Spiderman?",
            "De naissance",
            "Mordu par une araigné radioactive",
            "Expérience scientifique",
            "Un magicien",
            2
        )

        listeQuestionsNovice.add(q3)

        val q4 = Question(
            4,
            "Novice",
            "Dans la série \"Game of Thrones\", Winterfell est la demeure ancestrale de quelle famille?",
            "les Lannisters",
            "les Starks",
            "les Tully's",
            "les Targaryens",
            2
        )

        listeQuestionsNovice.add(q4)

        val q5 = Question(
            5,
            "Novice",
            "Quelle compagnie est connue pour leur personnage de jeu vidéo \"Mario\"?",
            "Xbox",
            "Nintendo",
            "SEGA",
            "EA",
            2
        )

        listeQuestionsNovice.add(q5)

        val q6 = Question(
            6,
            "Novice",
            "Quel est le raccourci pour la fonction \"Copie\" sur un ordinateur?",
            "ctrl v",
            "shift c",
            "ctrl c",
            "shift v",
            3
        )

        listeQuestionsNovice.add(q6)

        val q7 = Question(
            7,
            "Novice",
            "Popeye doit manger quel légume pour augmenter sa force?",
            "Broccoli",
            "Épinards",
            "Asperge",
            "Lentilles",
            2
        )

        listeQuestionsNovice.add(q7)

        val q8 = Question(
            8,
            "Novice",
            "Quel est le nom de la planète de Superman?",
            "Argon",
            "Rann",
            "Krypton",
            "Qward",
            3
        )

        listeQuestionsNovice.add(q8)

        val q9 = Question(
            9,
            "Novice",
            "Casablanca est la plus grosse ville de quel pays Africain?",
            "Égypte",
            "Maroc",
            "Tunisie",
            "Algérie",
            2
        )

        listeQuestionsNovice.add(q9)

        val q10 = Question(
            10,
            "Novice",
            "Quelle est la capitale de l'Ukraine?",
            "Kiev",
            "Vilnius",
            "Minsk",
            "Pristina",
            1
        )

        listeQuestionsNovice.add(q10)

        val q11 = Question(
            11,
            "Novice",
            "Qui est l'auteur du Seigneur des anneaux?",
            "Terry Pratchett",
            "J. R. R. Tolkie",
            "George R. R. Martin",
            "Neil Gaiman",
            2
        )

        listeQuestionsNovice.add(q11)

        val q12 = Question(
            12,
            "Novice",
            "Quelle est la plus grosse planète du Système Solaire?",
            "Saturne",
            "Neptune",
            "Jupiter",
            "Uranus",
            3
        )

        listeQuestionsNovice.add(q12)

        val q13 = Question(
            13,
            "Novice",
            "Dans la mythologie nordique, comment se nomme le père de Thor?",
            "Ragnarok",
            "Odin",
            "Loki",
            "Heimdall",
            2
        )

        listeQuestionsNovice.add(q13)

        val q14 = Question(
            14,
            "Novice",
            "Qui est considéré historiquement comme \"Le roi du Rock' n'roll\"?",
            "Angus Young",
            "Bob Dylan",
            "Bruce Springsteen",
            "Elvis Presley",
            4
        )

        listeQuestionsNovice.add(q14)

        val q15 = Question(
            15,
            "Novice",
            "Lequel de ces signes ne fait pas partie des signes astrologiques chinois?",
            "Chien",
            "Chat",
            "Cochon",
            "Singe",
            2
        )

        listeQuestionsNovice.add(q15)

        val q16 = Question(
            16,
            "Novice",
            "Dans la version dessin animé des studios Disney, qui est le grand méchant du film Peter Pan?",
            "Capitaine Crochet",
            "Jafar",
            "Frollo",
            "Scar",
            1
        )

        listeQuestionsNovice.add(q16)

        val q17 = Question(
            17,
            "Novice",
            "Dans la mythologie grecque, quelle déesse est considérée comme la déesse de l'amour?",
            "Athena",
            "Héra",
            "Aphrodite",
            "Artémis",
            3
        )

        listeQuestionsNovice.add(q17)

        val q18 = Question(
            18,
            "Novice",
            "Quel Empereur français, réputé pour être très petit, a perdu la bataille de Waterloo?",
            "La Fayette",
            "Louis XIV",
            "Napoléon",
            "François II",
            3
        )

        listeQuestionsNovice.add(q18)

        val q19 = Question(
            19,
            "Novice",
            "Combien de provinces compte le Canada?",
            "12",
            "11",
            "13",
            "10",
            4
        )

        listeQuestionsNovice.add(q19)

        val q20 = Question(
            20,
            "Novice",
            "Quelle est la capitale du Canada?",
            "Calgary",
            "Montréal",
            "Ottawa",
            "Québec",
            3
        )

        listeQuestionsNovice.add(q20)

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

        val q2 = Question(
            2,
            "Intermédiaire",
            "Qui est l'auteur de la phrase \"Je pense donc, je suis\"?",
            "Socrates",
            "Platon",
            "Aristote",
            "Descartes",
            4
        )

        listeQuestionsInter.add(q2)

        val q3 = Question(
            3,
            "Intermédiaire",
            "Combien y-a-t-il de fuseaux horaires dans le monde?",
            "8",
            "16",
            "24",
            "32",
            3
        )

        listeQuestionsInter.add(q3)

        val q4 = Question(
            4,
            "Intermédiaire",
            "En quelle année le mur de Berlin fut-il détruit?",
            "1985",
            "1989",
            "1987",
            "1991",
            2
        )

        listeQuestionsInter.add(q4)

        val q5 = Question(
            5,
            "Intermédiaire",
            "Le groupe sanguin d'un donneur universel est...",
            "AB+",
            "O-",
            "A+",
            "B-",
            2
        )

        listeQuestionsInter.add(q5)

        val q6 = Question(
            6,
            "Intermédiaire",
            "Quel pays de l'Union européenne est le plus peuplé?",
            "France",
            "Royaume-Uni",
            "Italie",
            "Allemagne",
            4
        )

        listeQuestionsInter.add(q6)

        val q7 = Question(
            7,
            "Intermédiaire",
            "Quelle activiste du mouvement des droits civiques aux États-Unis est connue pour avoir refusé de donner sa place de bus?",
            "Greta Thunberg",
            "Gloria Steinem",
            "Rosa Parks",
            "Angela Davis",
            3
        )

        listeQuestionsInter.add(q7)

        val q8 = Question(
            8,
            "Intermédiaire",
            "Quel était le nom de New York entre 1624 et 1664?",
            "New London",
            "New Paris",
            "New Edinburgh",
            "New Amsterdam",
            4
        )

        listeQuestionsInter.add(q8)

        val q9 = Question(
            9,
            "Intermédiaire",
            "Quelle date commémore la fin de la Seconde Guerre mondiale en Europe?",
            "8 mai",
            "11 novembre",
            "6 juin",
            "9 août",
            1
        )

        listeQuestionsInter.add(q9)

        val q10 = Question(
            10,
            "Intermédiaire",
            "Parmi ces pays, lequel ne fait pas partie du Maghreb?",
            "Liban",
            "Tunisiee",
            "Libye",
            "Algérie",
            1
        )

        listeQuestionsInter.add(q10)

        val q11 = Question(
            11,
            "Intermédiaire",
            "Quelle proportion d'habitants sur la planète vivent dans des villes?",
            "1 sur 2",
            "1 sur 4",
            "1 sur 5",
            "1 sur 10",
            1
        )

        listeQuestionsInter.add(q11)

        val q12 = Question(
            12,
            "Intermédiaire",
            "Le corps humain est composé d'environ...",
            "85% d'eau",
            "75% d'eau",
            "65% d'eau",
            "55% d'eau",
            3
        )

        listeQuestionsInter.add(q12)

        val q13 = Question(
            13,
            "Intermédiaire",
            "Combien de temps met un sac plastique pour se décomposer naturellement?",
            "150 ans",
            "300 ans",
            "450 ans",
            "600 ans",
            3
        )

        listeQuestionsInter.add(q13)

        val q14 = Question(
            14,
            "Intermédiaire",
            "Quel est l’emblème arboricole du Québec?",
            "L'érable",
            "Peuplier",
            "Saule pleureur",
            "Bouleau jaune",
            4
        )

        listeQuestionsInter.add(q14)

        val q15 = Question(
            15,
            "Intermédiaire",
            "Quel animal est l'emblème officiel du Canada?",
            "L'aigle impérial",
            "L'orignal",
            "Le castor",
            "L'ours polaire",
            3
        )

        listeQuestionsInter.add(q15)

        val q16 = Question(
            16,
            "Intermédiaire",
            "Quel est le nombre total d'os dans le corps humain?",
            "32",
            "196",
            "206",
            "512",
            3
        )

        listeQuestionsInter.add(q16)

        val q17 = Question(
            17,
            "Intermédiaire",
            "Lequel des suivants est nécessaire à la combustion?",
            "Pétrole",
            "Oxygène",
            "Azote",
            "Carbone",
            2
        )

        listeQuestionsInter.add(q17)

        val q18 = Question(
            18,
            "Intermédiaire",
            "Où est situé le canal de Suez?",
            "Libye",
            "Égypte",
            "Jordan",
            "Liban",
            2
        )

        listeQuestionsInter.add(q18)

        val q19 = Question(
            19,
            "Intermédiaire",
            "Quel est le vrai nom du bonhomme Michelin?",
            "Joe Ivory",
            "Mr. Rubber",
            "Big Stevie",
            "Mr. Bib",
            4
        )

        listeQuestionsInter.add(q19)

        val q20 = Question(
            20,
            "Intermédiaire",
            "La coulrophobie est la peur de...",
            "Mains",
            "Clowns",
            "Froid",
            "Chiens",
            2
        )

        listeQuestionsInter.add(q20)

        return listeQuestionsInter
    }

    fun getQuestionsExpert(): ArrayList<Question>{
        val listeQuestionsExpert = ArrayList<Question>()

        val q1 = Question(
            1,
            "Expert",
            "À quelle date le musée du Louvre a-t-il officiellement ouvert ses portes?",
            "26 mai 1650",
            "3 octobre 1801",
            "15 janvier 1872",
            "10 août 1793",
            4
        )

        listeQuestionsExpert.add(q1)

        val q2 = Question(
            2,
            "Expert",
            "Combien de temps met une pile à se décomposer?",
            "4000 ans",
            "6000 ans",
            "8000 ans",
            "10000 ans",
            3
        )

        listeQuestionsExpert.add(q2)

        val q3 = Question(
            3,
            "Expert",
            "Combien de litres d'eau nécessite la production d'un kilo de céréales?",
            "1500",
            "5500",
            "10500",
            "15500",
            1
        )

        listeQuestionsExpert.add(q3)

        val q4 = Question(
            4,
            "Expert",
            "En quelle année le 24 juin, jour de la Saint-Jean-Baptiste, est officiellement devenu le jour de la Fête nationale du Québec?",
            "1929",
            "1954",
            "1977",
            "1984",
            3
        )

        listeQuestionsExpert.add(q4)

        val q5 = Question(
            5,
            "Expert",
            "Quel gaz est libéré lorsque le charbon est brûlé?",
            "Oxygène",
            "Dioxyde de Carbone",
            "Azote",
            "Ozone",
            2
        )

        listeQuestionsExpert.add(q5)

        val q6 = Question(
            6,
            "Expert",
            "Les enzymes et les anticorps sont principalement constitués de...",
            "Vitamines",
            "Protéines",
            "Graisses",
            "Glucides",
            2
        )

        listeQuestionsExpert.add(q6)

        val q7 = Question(
            7,
            "Expert",
            "Qui a découvert la circulation du sang?",
            "Louis Pasteur",
            "Har Gobind Khorana",
            "Edward Jenner",
            "William Harvey",
            4
        )

        listeQuestionsExpert.add(q7)

        val q8 = Question(
            8,
            "Expert",
            "Zulia est une province de quel pays?",
            "Colombie",
            "Brésil",
            "Venezuela",
            "Équateur",
            3
        )

        listeQuestionsExpert.add(q8)

        val q9 = Question(
            9,
            "Expert",
            "Après Adam, Eve, Caïn et Abel, qui fut la prochaine personne mentionnée dans la Bible?",
            "Enoch",
            "Jubal",
            "Lamech",
            "Ziliah",
            1
        )

        listeQuestionsExpert.add(q9)

        val q10 = Question(
            10,
            "Expert",
            "En quelle année fut prise la première photo?",
            "1793",
            "1860",
            "1826",
            "1912",
            3
        )

        listeQuestionsExpert.add(q10)

        val q11 = Question(
            11,
            "Expert",
            "Quel continent a 2 des 5 plus longues rivières du monde?",
            "Asie",
            "Amérique du Sud",
            "Afrique",
            "Amérique du Nord",
            1
        )

        listeQuestionsExpert.add(q11)

        val q12 = Question(
            12,
            "Expert",
            "Quelle planète pourrait flotter dans l'eau?",
            "Uranus",
            "Mars",
            "Mercure",
            "Saturne",
            4
        )

        listeQuestionsExpert.add(q12)

        val q13 = Question(
            13,
            "Expert",
            "Quel fut le premier film de Disney en couleur?",
            "Cendrillon",
            "Pinocchio",
            "Dumbo",
            "Blanche Neige et les Sept Nains",
            4
        )

        listeQuestionsExpert.add(q13)

        val q14 = Question(
            14,
            "Expert",
            "Qui fut le 2e astronaute à mettre pied sur la lune?",
            "Yuri Gagarin",
            "James Irwin",
            "Alan Bean",
            "Buzz Aldrin",
            4
        )

        listeQuestionsExpert.add(q14)

        val q15 = Question(
            15,
            "Expert",
            "L'anémophobie est la peur de...",
            "Araignées",
            "Noirceur",
            "Feu",
            "Vent",
            4
        )

        listeQuestionsExpert.add(q15)

        val q16 = Question(
            16,
            "Expert",
            "Frederick Sanger est l'inventeur de...",
            "L'insuline",
            "L'épingle de sûreté",
            "Radeau pneumatique",
            "Aspirine",
            1
        )

        listeQuestionsExpert.add(q16)

        val q17 = Question(
            17,
            "Expert",
            "Proche de quel pays est-ce que le bateau \"Amoco Cadiz\" a-t-il coulé?",
            "Afrique du Sud",
            "France",
            "États-Unis",
            "Espagne",
            2
        )

        listeQuestionsExpert.add(q17)

        val q18 = Question(
            18,
            "Expert",
            "Quel est l'insecte le plus rare au monde?",
            "Fourmi panda",
            "Scarabé rhinocéros",
            "Homard des arbres",
            "Mélissa bleu",
            3
        )

        listeQuestionsExpert.add(q18)

        val q19 = Question(
            19,
            "Expert",
            "Quelle planète tourne le plus vite?",
            "Jupiter",
            "Mars",
            "Uranus",
            "Saturne",
            1
        )

        listeQuestionsExpert.add(q19)

        val q20 = Question(
            20,
            "Expert",
            "Qui fut le plus jeune joueur de tennis à être classé numéro 1 dans le monde?",
            "Martina Hingis",
            "Lleyton Hewitt",
            "Roger Federer",
            "Cori \"Coco\" Gauff",
            2
        )

        listeQuestionsExpert.add(q20)

        return listeQuestionsExpert
    }
}