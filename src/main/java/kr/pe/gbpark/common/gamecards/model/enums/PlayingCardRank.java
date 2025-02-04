package kr.pe.gbpark.common.gamecards.model.enums;

import lombok.Getter;

@Getter
public enum PlayingCardRank {
    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(11, "J"),
    QUEEN(12, "Q"),
    KING(13, "K");

    private final int defaultValue;
    private final String symbol;
    PlayingCardRank(int defaultValue, String symbol) {
        this.symbol = symbol;
        this.defaultValue = defaultValue;
    }
}
