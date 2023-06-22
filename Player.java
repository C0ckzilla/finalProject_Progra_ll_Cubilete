package Final;

import java.util.*;
import java.util.stream.Collectors;

public class Player {

    private static final int ROLL_COST = 100;

    private String name;
    private List<Die> dice;
    private Hand hand;
    private List<Integer> handValues;
    private int balance;
    private int value;

    public Player(String name) {
        this.name = name;
        this.dice = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dice.add(new Die());
        }
        this.balance = 1000;
    }

    public boolean canRoll() {
        return balance >= ROLL_COST;
    }

    public void rollDice() {
        if (!canRoll()) {
            throw new IllegalStateException("Insufficient balance to roll dice");
        }
        balance -= ROLL_COST;
        for (Die die : dice) {
            die.roll();
        }
        this.hand = Hand.evaluateHand(dice);
        this.handValues = dice.stream().map(Die::getValue).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        this.value = hand.ordinal() * 1000 + handValues.stream().mapToInt(Integer::intValue).sum();
    }

    public void displayHand() {
        System.out.println(name + "'s hand:");
        for (Die die : dice) {
            System.out.println(die.getValue());
        }
    }

    public String getName() {
        return name;
    }

    public List<Die> getDice() {
        return dice;
    }

    public Hand getHand() {
        return hand;
    }

    public List<Integer> getHandValues() {
        return handValues;
    }

    public int getBalance() {
        return balance;
    }

    public int getValue() {
        return value;
    }
}
