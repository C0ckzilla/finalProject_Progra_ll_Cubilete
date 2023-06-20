package Final;
import java.util.*;

public enum Hand {
    NOTHING,
    PAIR,
    TWO_PAIR,
    THREE_OF_A_KIND,
    STRAIGHT,
    FULL_HOUSE,
    FOUR_OF_A_KIND,
    FIVE_OF_A_KIND;

    public static Hand evaluateHand(List<Die> dice) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Die die : dice) {
            counts.put(die.getValue(), counts.getOrDefault(die.getValue(), 0) + 1);
        }

        Hand hand;
        if (counts.containsValue(5)) {
            hand = FIVE_OF_A_KIND;
        } else if (counts.containsValue(4)) {
            hand = FOUR_OF_A_KIND;
        } else if (counts.containsValue(3) && counts.containsValue(2)) {
            hand = FULL_HOUSE;
        } else if (counts.keySet().stream().max(Integer::compare).get() - counts.keySet().stream().min(Integer::compare).get() == 4 && counts.size() == 5) {
            hand = STRAIGHT;
        } else if (counts.containsValue(3)) {
            hand = THREE_OF_A_KIND;
        } else if (counts.values().stream().filter(val -> val == 2).count() == 2) {
            hand = TWO_PAIR;
        } else if (counts.containsValue(2)) {
            hand = PAIR;
        } else {
            hand = NOTHING;
        }

        return hand;
    }
}
