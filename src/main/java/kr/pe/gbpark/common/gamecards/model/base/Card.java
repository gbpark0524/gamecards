package kr.pe.gbpark.common.gamecards.model.base;

import kr.pe.gbpark.common.gamecards.model.enums.CardType;
import lombok.Getter;

@Getter
public abstract class Card {
    private boolean faceUp = false;

    public void flip() {
        faceUp = !faceUp;
    }

    public abstract String getSymbol();
    public abstract String getName();
    public abstract int getValue();
    public abstract String getLabel();
    public abstract CardType getType();
}
