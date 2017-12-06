import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> allCards;

    public Deck(){
        this.allCards = new ArrayList<>();
    }

    public int countCards(){
        return allCards.size();
    }

    public void addToDeck(Card card){
        allCards.add(card);
    }

    public ArrayList<Card> populateDeck() {
        for (SuitType suitType : SuitType.values()) {
            for (CardTypes cardTypes : CardTypes.values()) {
                allCards.add(new Card(suitType, cardTypes));
            }
        }
        return allCards;
    }

    public Card takeFirstCard(){
        return allCards.get(0);
    }

    public Card shuffleDeck(){
        Collections.shuffle(allCards);
        return allCards.get(0);
    }

}
