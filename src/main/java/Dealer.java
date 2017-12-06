import java.util.ArrayList;

public class Dealer {

    private String name;
    private ArrayList<Card> hand;

    public Dealer(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandCount(){
        return this.hand.size();
    }

    public Card playCard(){
        Card dealerCard = this.hand.get(0);
        return dealerCard;
    }
}
