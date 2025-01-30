package kr.pe.gbpark.common.gamecards.model.cards.playing;

import kr.pe.gbpark.common.gamecards.model.base.Deck;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardRank;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardSuit;

import java.util.ArrayList;

public class PlayingCardDeck extends Deck {

    public PlayingCardDeck() {
        createDeck();
    }

    @Override
    protected void createDeck() {
        cards = new ArrayList<>();
        for (PlayingCardSuit suit : PlayingCardSuit.values()) {
            for (PlayingCardRank rank : PlayingCardRank.values()) {
                cards.add(new PlayingCard(rank, suit));
            }
        }
    }
}
