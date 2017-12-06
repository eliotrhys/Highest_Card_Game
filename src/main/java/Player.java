import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
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
        Card playerCard = this.hand.get(0);
        return playerCard;
    }
}
