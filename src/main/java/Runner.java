import java.io.InputStreamReader;
        import java.util.Scanner;

public class Runner {

    private Player player;
    private Dealer dealer;
    private Deck deck;

    public Runner(Player player, Dealer dealer, Deck deck){
        this.player = new Player("Bob");
        this.dealer = new Dealer("Evil Bob's Cousin Bobby");
        this.deck = new Deck();
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Welcome to the game!");
        System.out.println("Type BEGIN to, y'know... begin.");
        String input = scanner.nextLine();
        if (input.equals("BEGIN"))
        {
            System.out.println("Awrite mate lets " + input + "!");
        }
        else
        {
            System.out.println("Well then.");
        }

        deck.populateDeck();
        System.out.println("Just shuffling the deck!");
        deck.shuffleDeck();
        System.out.println("Now I'm dealing the cards.");
        deck.dealCards(player, dealer);


        Card playerCard = player.playCard();
        Card dealerCard = dealer.playCard();
        System.out.println("***YOU CHECK YOUR CARDS***");
        String output = String.format("***YOU HAVE A %!", playerCard.getValueFromEnum());
        System.out.println(output);
    }




}
