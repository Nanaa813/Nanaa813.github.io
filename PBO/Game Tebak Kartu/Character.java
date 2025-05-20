public class Character {
    private String name;
    private Card card;

    public Character(String name) {
        this.name = name;
        this.card = new Card();
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public void drawCard() {
        this.card.draw();
    }
}
