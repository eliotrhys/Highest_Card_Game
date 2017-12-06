public enum SuitType {

    HEARTS("HEARTS"),
    DIAMONDS("DIAMONDS"),
    SPADES("SPADES"),
    CLUBS("CLUBS");

    private final String suit;

    SuitType(String suit){
        this.suit = suit;
    }

    public String getSuit(){
        return suit;
    }
}
