package kr.pe.gbpark.common.gamecards.model.base;

import kr.pe.gbpark.common.gamecards.model.enums.CardType;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardRank;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardSuit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {
    private static final PlayingCardRank GIVEN_RANK = PlayingCardRank.ACE;
    private static final PlayingCardSuit GIVEN_SUIT = PlayingCardSuit.SPADES;
    private PlayingCard card;


    @BeforeEach
    void setup() {
        card = new PlayingCard(GIVEN_RANK, GIVEN_SUIT);
    }

    @Test
    void faceUpTest() {
        assertFalse(card.isFaceUp());
        card.flip();
        assertTrue(card.isFaceUp());
    }

    @Test
    void symbolTest() {
        assertEquals(GIVEN_SUIT.getSymbol() + GIVEN_RANK.getSymbol(), card.getSymbol());
    }

    @Test
    void nameTest() {
        assertEquals(GIVEN_RANK.name() + " of " + GIVEN_SUIT.name(), card.getName());
    }

    @Test
    void valueTest() {
        assertEquals(GIVEN_RANK.getDefaultValue(), card.getValue());
    }

    @Test
    void labelTest() {
        assertEquals(GIVEN_RANK.getSymbol(), card.getLabel());
    }

    @Test
    void typeTest() {
        assertEquals(CardType.PLAYING_CARD, card.getType());
    }
}