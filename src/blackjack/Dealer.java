/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author gubotdev
 */
public class Dealer {
    private Player[] myPlayers;
    private Deck myDeck = new Deck();
    private Hand dealerHand = new Hand();
    private Scanner scan = new Scanner(System.in);
   
    public Dealer(int unm0fPlayers){
        initMyPlayers(unm0fPlayers);
    }    

    Dealer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        public void dealOutOpeningHand(){
            for(int i = 0; i< 2; i++){
                for (Player currPlayer : myPlayers){
                    currPlayer.getMyHand().addCard(myDeck.dealCard());
                    
        }
                dealerHand.addCard(myDeck.dealCard());
            }
        }
        public void takePlayerTurns(){
            for(Player currPlayer : myPlayers){
               while(currPlayer.getMyHand().getNum0fCards() < 5 &&
                       currPlayer.getMyHand().getScore() <21){
                   System.out.println(currPlayer.getName() + " Hand");
                   currPlayer.getMyHand().printHand();
                   System.out.println("wanna Hit? (y/n)");
                   char opt = scan.next().charAt(0);
                   if(opt=='y'){
                       currPlayer.getMyHand().addCard(myDeck.dealCard());
                   }
               }
               currPlayer.getMyHand().printHand();
        }
        }
        public void playerOutDealerHand(){
            while(dealerHand.getScore() < 16){
                dealerHand.addCard(myDeck.dealCard());
        }
            dealerHand.printHand();
        }
        
        public void declerWinner(){
            for(Player currPlayer : myPlayers){
                if(currPlayer.getMyHand().getScore() > 21){
                    System.out.println("Dealer won!");
                }else if(dealerHand.getScore() > 21 && dealerHand.getNum0fCards()
                        > 5 ){
                    System.out.println("The player won!");
                }else if (currPlayer.getMyHand().getScore() < 22 && dealerHand
                        .getScore() < 21 && dealerHand.getNum0fCards() < 5){
                            System.out.println("The Player won!");
                }else if (currPlayer.getMyHand().getNum0fCards() == 5 &&
                        dealerHand.getNum0fCards() < 5  && dealerHand.getScore() < 21){
                    System.out.println("The Player won!");
                }
            }
        }
        
    private void initMyPlayers(int num){
        myPlayers = new Player[num];
            for(int i = 0; i < myPlayers.length; i++){
                System.out.println("Player" +(i+1) +"what's your name");
                String name = scan .next();
                if(name.equals("")){
                    myPlayers[i] = new Player(i+1);
                }else{
                    myPlayers[i] = new Player(name);
                } 
            }
     
    }
}

