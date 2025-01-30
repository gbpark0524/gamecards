package kr.pe.gbpark.common.gamecards.exceptions;

public class DeckEmptyException extends RuntimeException {
    public DeckEmptyException() {
        super("Deck is empty");
    }
}
