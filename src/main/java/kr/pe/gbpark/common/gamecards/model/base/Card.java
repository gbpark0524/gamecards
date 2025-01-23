package kr.pe.gbpark.common.gamecards.model.base;

import kr.pe.gbpark.common.gamecards.model.enums.CardType;
import lombok.Getter;

@Getter
public abstract class Card implements Comparable<Card> {
    private boolean faceUp = false;

    public void flip() {
        faceUp = !faceUp;
    }

    public abstract String getSymbol();
    public abstract String getName();
    public abstract int getValue();
    public abstract int getNumber();
    public abstract CardType getType();

    @Override
    public int compareTo(Card other) {
        int typeCompare = this.getType().compareTo(other.getType());
        if (typeCompare != 0) {
            return typeCompare;
        }

        return Integer.compare(this.getValue(), other.getValue());
    }
}
