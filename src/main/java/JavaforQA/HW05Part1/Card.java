package JavaforQA.HW05Part1;

class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Color getColor() {
        return suit.getColor();
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
