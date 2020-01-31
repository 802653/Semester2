/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card a = new Card("Jack", "Clubs", 11);
        Card b = new Card("King", "Diamonds",13);
        Card c = new Card("Ace", "Spades", 1 );
        Card d = new Card("Queen", "Hearts", 12);
        
        System.out.println(a.toString() + "\n" +
        b.toString() + "\n" +
        c.toString() + "\n" +
        d.toString());
        
    }
}
