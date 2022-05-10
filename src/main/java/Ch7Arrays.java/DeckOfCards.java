package Ch7Arrays.java;

import java.security.SecureRandom;

public class DeckOfCards {
    static SecureRandom random=new SecureRandom();
    private static final int NUMBER_OF_CARDS=52;
    private Card[] deck=new Card[NUMBER_OF_CARDS];
    private int card=0;
    public DeckOfCards(){
        String[] faces={"Ace" , "Deuce" , "Three" , "Four" ,"Five" ,"Six" ,"Seven"
                ,"Eight" ,"Nine" , "Ten" , "Jack" , "Queen" , "King"};
        String[] suits={"Hearts" , "Diamonds" , "Clubs" , "Spades"};
        }

    }


