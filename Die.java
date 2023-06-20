package Final;
public class Die {

    private static final int NUM_SIDES = 6;
    private int value;

    public Die() {
        roll();
    }

    public void roll() {
        this.value = (int) (Math.random() * NUM_SIDES) + 1;
    }

    public int getValue() {
        return value;
    }
}
