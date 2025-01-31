package kr.pe.gbpark.common.gamecards.model.game;

import kr.pe.gbpark.common.gamecards.model.base.Card;
import kr.pe.gbpark.common.gamecards.model.enums.PlayerState;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Getter
@ToString
public class Player {
    private String id;
    private String name;
    private final List<Card> hand = new ArrayList<>();
    private PlayerState state;

    public Card discard(int index) {
        return hand.remove(index);
    }

    public Optional<Card> discard(Card card) {
        return hand.remove(card) ? Optional.ofNullable(card) : Optional.empty();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> showHand() {
        return Collections.unmodifiableList(hand);
    }
}
