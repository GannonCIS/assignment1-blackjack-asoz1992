package blackjack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author gubotdev
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Deck myDeck = new Deck();
       Hand myHand = new Hand ();
       for(int i = 0; i < 6; i++){
          Card temp = myDeck.dealCard();
          myHand.addCard(myDeck.dealCard());
         System.out.println("num0fCards:"+ myHand.getNum0fCards() + " |"
                 + "scroe:" + myHand.getScore());
         
       }
       
    }
    
}
