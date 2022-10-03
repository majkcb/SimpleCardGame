package com.example.simplecardgame

class Deck {
    var deckOfCards = mutableListOf<Card>()

    init {
        initializeDeck()
    }

    fun getCard() : Card {

        if (deckOfCards.isEmpty() ) { //använder alla kort innan de kan användas igen
            initializeDeck()
        }

        val random = (0 until deckOfCards.size).random()
        return deckOfCards[random]
    }

  //  fun getUsedCard() : Card {

    //}

    fun initializeDeck() {

        val clubsace = Card(R.drawable.clubsace, 1)
        val clubstwo = Card(R.drawable.clubstwo, 2)
        val clubsthree = Card(R.drawable.clubsthree, 3)
        val clubsfour = Card(R.drawable.clubsfour, 4)
        val clubsfive = Card(R.drawable.clubsfive, 5)
        val clubssix = Card(R.drawable.clubssix, 6)
        val clubsseven = Card(R.drawable.clubsseven, 7)
        val clubseight = Card(R.drawable.clubseight, 8)
        val clubsnine = Card(R.drawable.clubsnine, 9)
        val clubsten = Card(R.drawable.clubsten, 10)
        val clubsj = Card(R.drawable.clubsj, 11)
        val clubsq = Card(R.drawable.clubsq, 12)
        val clubsk = Card(R.drawable.clubsk, 13)

        val diamondsace = Card(R.drawable.diamondace, 1)
        val diamondstwo = Card(R.drawable.diamondstwo, 2)
        val diamondsthree = Card(R.drawable.diamondsthree, 3)
        val diamondsfour = Card(R.drawable.diamondsfour, 4)
        val diamondsfive = Card(R.drawable.diamondsfive, 5)
        val diamondssix = Card(R.drawable.diamondsix, 6)
        val diamondsseven = Card(R.drawable.diamondseven, 7)
        val diamondseight = Card(R.drawable.diamondeight, 8)
        val diamondsnine = Card(R.drawable.diamondnine, 9)
        val diamondsten = Card(R.drawable.diamondten, 10)
        val diamondsj = Card(R.drawable.diamondj, 11)
        val diamondsq = Card(R.drawable.diamondq, 12)
        val diamondsk = Card(R.drawable.diamondk, 13)

        val spadesace = Card(R.drawable.spadesace, 1)
        val spadestwo = Card(R.drawable.spadestwo, 2)
        val spadesthree = Card(R.drawable.spadesthree, 3)
        val spadesfour = Card(R.drawable.spadesfour, 4)
        val spadesfive = Card(R.drawable.spadesfive, 5)
        val spadessix = Card(R.drawable.spadessix, 6)
        val spadesseven = Card(R.drawable.spadesseven, 7)
        val spadeseight = Card(R.drawable.spadeseight, 8)
        val spadesnine = Card(R.drawable.spadesnine, 9)
        val spadesten = Card(R.drawable.spadesten, 10)
        val spadesj = Card(R.drawable.spadesj, 11)
        val spadesq = Card(R.drawable.spadesq, 12)
        val spadesk = Card(R.drawable.spadesk, 13)

        val heartsace = Card(R.drawable.heartsace, 1)
        val heartstwo = Card(R.drawable.heartstwo, 2)
        val heartsthree = Card(R.drawable.heartsthree, 3)
        val heartsfour = Card(R.drawable.heartsfour, 4)
        val heartsfive = Card(R.drawable.heartsfive, 5)
        val heartsix = Card(R.drawable.heartssix, 6)
        val heartsseven = Card(R.drawable.heartsseven, 7)
        val heartseight = Card(R.drawable.heartseight, 8)
        val heartsnine = Card(R.drawable.heartsnine, 9)
        val heartsten = Card(R.drawable.heartsthen, 10)
        val heartsj = Card(R.drawable.heartsj, 11)
        val heartsq = Card(R.drawable.heartsq, 12)
        val heartsk = Card(R.drawable.heartsk, 13)

        deckOfCards.add(clubsace)
        deckOfCards.add(clubstwo)
        deckOfCards.add(clubsthree)
        deckOfCards.add(clubsfour)
        deckOfCards.add(clubsfive)
        deckOfCards.add(clubssix)
        deckOfCards.add(clubsseven)
        deckOfCards.add(clubseight)
        deckOfCards.add(clubsnine)
        deckOfCards.add(clubsten)
        deckOfCards.add(clubsj)
        deckOfCards.add(clubsq)
        deckOfCards.add(clubsk)

        deckOfCards.add(diamondsace)
        deckOfCards.add(diamondstwo)
        deckOfCards.add(diamondsthree)
        deckOfCards.add(diamondsfour)
        deckOfCards.add(diamondsfive)
        deckOfCards.add(diamondssix)
        deckOfCards.add(diamondsseven)
        deckOfCards.add(diamondseight)
        deckOfCards.add(diamondsnine)
        deckOfCards.add(diamondsten)
        deckOfCards.add(diamondsj)
        deckOfCards.add(diamondsq)
        deckOfCards.add(diamondsk)

        deckOfCards.add(spadesace)
        deckOfCards.add(spadestwo)
        deckOfCards.add(spadesthree)
        deckOfCards.add(spadesfour)
        deckOfCards.add(spadesfive)
        deckOfCards.add(spadessix)
        deckOfCards.add(spadesseven)
        deckOfCards.add(spadeseight)
        deckOfCards.add(spadesnine)
        deckOfCards.add(spadesten)
        deckOfCards.add(spadesj)
        deckOfCards.add(spadesq)
        deckOfCards.add(spadesk)

        deckOfCards.add(heartsace)
        deckOfCards.add(heartstwo)
        deckOfCards.add(heartsthree)
        deckOfCards.add(heartsfour)
        deckOfCards.add(heartsfive)
        deckOfCards.add(heartsix)
        deckOfCards.add(heartsseven)
        deckOfCards.add(heartseight)
        deckOfCards.add(heartsnine)
        deckOfCards.add(heartsten)
        deckOfCards.add(heartsj)
        deckOfCards.add(heartsq)
        deckOfCards.add(heartsk)

    }

}




