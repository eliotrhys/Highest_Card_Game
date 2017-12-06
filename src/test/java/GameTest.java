import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck testDeck;
    Card testCard1;
    Card testCard2;
    Player testPlayer;
    Dealer testDealer;
    Game testGame;


    @Before
    public void before(){
        testDeck = new Deck();
        testPlayer = new Player("Jim");
        testDealer = new Dealer("Evil");
        testCard1 = new Card(SuitType.HEARTS, CardTypes.KING);
        testCard2 = new Card(SuitType.HEARTS, CardTypes.TWO);
        testGame = new Game();
    }

    @Test
    public void doesGameWork(){
        testDeck.populateDeck();
        testDeck.shuffleDeck();
        testDeck.dealCards(testPlayer, testDealer);
        Card playerCard = testPlayer.playCard();
        Card dealerCard = testDealer.playCard();
        assertEquals("Player wins!", testGame.compareCards(playerCard, dealerCard));
    }

}
