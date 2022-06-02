/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
import java.util.*;
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Card[] magicHandy = new Card[7]; //Array of object
        Card luckycard = new Card();
        luckycard.setSuits("spades");
        luckycard.setValue(6);
        
        for( int i=0;i<magicHandy.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(new Random().nextInt(13));//use a method to generate random *13
            c1.setSuits(Card.SUITS[ new Random().nextInt(4)]);//random method suit 
            magicHandy[i]=c1;
            
            System.out.println(c1.getSuits() + " : " + c1.getValue());
        }
        //step 2:take input 
        System.out.println("Choose Suit for your Card");
        System.out.println("\n Diamonds\n" + " Clubs\n" + " Spades\n" + " Hearts\n");
        int cardSUIT = scan.nextInt();
        
        System.out.println("Enter your card number from 1-10 and 11 -> JACK, 12 -> QUEEN, 13 -> KING");
        int cardNUMBER = scan.nextInt();

        //step 3: match with array 1
        
        for(int i=0; i<magicHandy.length; i++) {
            if(magicHandy[i].getValue()== cardNUMBER && magicHandy[i].getSuits()==Card.SUITS[cardSUIT-1])
                System.out.println("you are done " + i);
            else
                System.out.println("no match" + i);
        } 
    }
    
}