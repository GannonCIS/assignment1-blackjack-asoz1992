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
    Card[] myCards = new Card [5];
    private int num0fCards= 0;
    private int score = 0;
    
    public Hand(){}
    
    public int getNum0fCard(){
        return num0fCards;
    }
    public int getScore(){
        return score;
    }
    public void addCard(Card newCard ){
        if(num0fCards>4){
            System.out.println("Too many cards for this hand ");
        }else{
            myCards[num0fCards]= newCard;
            num0fCards++;
            try{
                
            
            score +=Integer.parseInt(newCard.RANK);  
            }catch(java.lang.NumberFormatException ex){
                if (newCard.RANK.equals("Ace")){
                    score +=1;
                }else{
                    score +=10;
                    
                    
                }
            }
        }
    }
    public void printHand(){
          for (int i = 0; i < myCards.length; i++){
              System.out.println(myCards[i].RANK +" of " + myCards [i]. SUIT);
          } 
    }
}
