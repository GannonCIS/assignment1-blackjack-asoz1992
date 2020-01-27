/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author gubotdev
 */
public class Hand {
    Card[] myCard = new Card [5];
    private int num0fCards= 0;
    private int score = 0;
    
    public Hand(){}
    
    public int getNum0fCard(){
        return num0fCards;
    }
    public int getScore(){
        return score;
    }
    public void addCard (Card newCard ){
        
    }
    public void printHand(){
        
    }
}
