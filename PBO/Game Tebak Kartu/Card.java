import java.util.Random;

public class Card {
    private int value;

    public Card() {
        draw(); 
    }

    public void draw() {
        Random rand = new Random();
        value = rand.nextInt(13) + 1; 
    }

    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        return switch (value) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(value);
        };
    }
}
