/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.shuffle;

import java.security.SecureRandom;

/**
 *
 * @author cedwa
 */
public class CardShuffle {

    private card[] deck;
    
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    
    private static final SecureRandom randomNumbers = new SecureRandom();
            
    public CardShuffle()
    {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", 
            "Eight", "Nine", "Ten", "Jack", "King", "Queen"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; 
       
        deck =  new card[NUMBER_OF_CARDS];
        currentCard =0;
        
        for(int count=0; count<deck.length; count++)
        {
            deck[count] = new card(faces[count%13], suits[count/13]);
        }
    }   
    
    public void shuffle()
    {
        currentCard = 0;
       
        for(int first=0; first<deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            card temp = deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
        
    }
    
    public card dealCard()
    {
        if(currentCard<deck.length)
            return deck[currentCard++];
        else return null;
    }
    
    public static void main( String[] args)
    {
       CardShuffle myDeckOfCards= new CardShuffle();
       
       myDeckOfCards.shuffle();
       
       int  c=0;
       for(int i=0; i<52; i++)
       {
           c++;
           System.out.printf("%19s", myDeckOfCards.dealCard());
           if(c%4==0)
               System.out.println();
       }
       System.out.println();

    }
    
}
