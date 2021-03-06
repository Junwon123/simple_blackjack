package com.cnu.blackjack;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Hand {

    private Deck deck;
    private List<Card> handList = new ArrayList<Card>();

    public Hand(Deck deck) {
        this.deck = deck;
    }

    public Card drawCard() {
        Card card = deck.drawCard();
        handList.add(card);
        return card;
    }

    public int getCurrentHandSize() {
        return handList.size();
    }
}
