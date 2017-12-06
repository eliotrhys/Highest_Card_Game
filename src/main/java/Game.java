public class Game {

    public String compareCards(Card playerCard, Card dealerCard){
        if (playerCard.getValueFromEnum() > dealerCard.getValueFromEnum()){
            return "Player wins!";
        }
        else if (playerCard.getValueFromEnum() < dealerCard.getValueFromEnum()){
            return "Dealer wins!";
        }
        else{
            return "It's a draw!";
        }
    }

}
