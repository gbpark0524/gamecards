package kr.pe.gbpark.common.gamecards.model.base;

import kr.pe.gbpark.common.gamecards.exceptions.DeckEmptyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
    protected List<Card> cards = new ArrayList<>();

    protected abstract void createDeck();

    public Deck addCard(Card card) {
        cards.add(card);
        return this;
    }

    public Deck shuffle() {
        Collections.shuffle(cards);
        return this;
    }

    public Card draw() {
        chkEmpty();
        return cards.remove(cards.size() - 1);
    }

    public Card drawBottom() {
        chkEmpty();
        return cards.remove(0);
    }

    public Card peek() {
        chkEmpty();
        return cards.get(cards.size() - 1);
    }

    public Card peekBottom() {
        chkEmpty();
        return cards.get(0);
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    private void chkEmpty() {
        if (cards.isEmpty()) {
            throw new DeckEmptyException();
        }
    }
}
