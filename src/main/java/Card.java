public class Card {

    private SuitType suit;
    private CardTypes value;


    public Card(SuitType suit, CardTypes value){
        this.suit = suit;
        this.value = value;
    }

    public SuitType getSuit() {
        return suit;
    }

    public CardTypes getValue() {
        return value;
    }

    public int getValueFromEnum(){
        return this.value.getValue();
    }

    public String getSuitFromEnum(){
        return this.suit.getSuit();
    }
}
