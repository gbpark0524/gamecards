package kr.pe.gbpark.common.gamecards.model.base;

import kr.pe.gbpark.common.gamecards.model.enums.CardType;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardRank;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardSuit;
import lombok.Getter;

@Getter
public class PlayingCard extends Card {
    private final PlayingCardRank rank;
    private final PlayingCardSuit suit;

    public PlayingCard(PlayingCardRank rank, PlayingCardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String getSymbol() {
        return suit.getSymbol() + rank.getSymbol();
    }

    @Override
    public String getName() {
        return rank.name() + " of " + suit.name();
    }

    @Override
    public int getValue() {
        return rank.getDefaultValue();
    }

    @Override
    public String getLabel() {
        return rank.getSymbol();
    }

    @Override
    public CardType getType() {
        return CardType.PLAYING_CARD;
    }
}