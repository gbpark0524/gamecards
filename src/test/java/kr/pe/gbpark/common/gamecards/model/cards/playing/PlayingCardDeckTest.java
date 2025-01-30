package kr.pe.gbpark.common.gamecards.model.cards.playing;

import kr.pe.gbpark.common.gamecards.exceptions.DeckEmptyException;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardRank;
import kr.pe.gbpark.common.gamecards.model.enums.PlayingCardSuit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardDeckTest {

    private static final int STANDARD_DECK_SIZE = 52;
    private PlayingCardDeck deck;
    private static final PlayingCardRank GIVEN_RANK = PlayingCardRank.ACE;
    private static final PlayingCardSuit GIVEN_SUIT = PlayingCardSuit.SPADES;

    @BeforeEach
    void setup() {
        deck = new PlayingCardDeck();
    }

    @Test
    void createDeckSizeTest() {
        assertEquals(STANDARD_DECK_SIZE, deck.size());
    }

    @Test
    void drawAndPeekTest() {
        PlayingCard peeked = (PlayingCard) deck.peek();
        PlayingCard drawn = (PlayingCard) deck.draw();

        assertEquals(peeked.getRank(), drawn.getRank());
        assertEquals(peeked.getSuit(), drawn.getSuit());
        assertEquals(STANDARD_DECK_SIZE - 1, deck.size());
    }

    @Test
    void drawBottomAndPeekBottomTest() {
        PlayingCard peeked = (PlayingCard) deck.peekBottom();
        PlayingCard drawn = (PlayingCard) deck.drawBottom();

        assertEquals(peeked.getRank(), drawn.getRank());
        assertEquals(peeked.getSuit(), drawn.getSuit());
        assertEquals(STANDARD_DECK_SIZE - 1, deck.size());
    }

    @Test
    void addCardTest() {
        PlayingCard newCard = new PlayingCard(GIVEN_RANK, GIVEN_SUIT);
        assertEquals(STANDARD_DECK_SIZE + 1, deck.addCard(newCard).size());
    }

    @Test
    void emptyDeckTest() {
        for (int i = 0; i < STANDARD_DECK_SIZE; i++) {
            deck.draw();
        }
        assertTrue(deck.isEmpty());
        assertThrows(DeckEmptyException.class, () -> deck.draw());
    }

    @Test
    void shuffleTest() {
        PlayingCard topCard = (PlayingCard) deck.peek();
        assertNotEquals(topCard.getRank(), ((PlayingCard) deck.shuffle().peek()).getRank());
    }
}