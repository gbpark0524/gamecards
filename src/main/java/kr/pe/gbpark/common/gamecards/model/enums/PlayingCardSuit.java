package kr.pe.gbpark.common.gamecards.model.enums;

import lombok.Getter;

@Getter
public enum PlayingCardSuit {
    SPADES("♠"),
    HEARTS("♥"),
    DIAMONDS("♦"),
    CLUBS("♣");

    private final String symbol;

    PlayingCardSuit(String symbol) {
        this.symbol = symbol;
    }

}
