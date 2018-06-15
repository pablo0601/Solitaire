/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author michael.pierik700
 */
public class Deck {
    //Variable Decleration
    List<Card> card = new ArrayList<>();
    String cPath;
  
    public Deck() {
        //for each suit, for each value
        for(Card.Suit s: Card.Suit.values()){
            for(Card.Value v: Card.Value.values()){
                cPath = "JPEG/";
                switch (v) {
                    case Ace:
                        cPath += "A";
                        break;
                    case Two:
                        cPath += "2";
                        break;
                    case Three:
                        cPath += "3";
                        break;
                    case Four:
                        cPath += "4";
                        break;
                    case Five:
                        cPath += "5";
                        break;
                    case Six:
                        cPath += "6";
                        break;
                    case Seven:
                        cPath += "7";
                        break;
                    case Eight:
                        cPath += "8";
                        break;
                    case Nine:
                        cPath += "9";
                        break;
                    case Ten:
                        cPath += "10";
                        break;
                    case Jack:
                        cPath += "J";
                        break;
                    case Queen:
                        cPath += "Q";
                        break;
                    case King:
                        cPath += "K";
                        break;
                }
                
                switch (s) {
                    case Club:
                        cPath += "C";
                        break;
                    case Spade:
                        cPath += "S";
                        break;
                    case Diamond:
                        cPath += "D";
                        break;
                    case Heart:
                        cPath += "H";
                        break;
                }
                cPath += ".jpg";
                //Create a card in the deck
                //System.out.println(cPath);
                card.add(new Card(s,v, cPath)); 
            }
        }
        System.out.println("Deck Made");
        //gives cards images
      //setImg();
        
        //runs shuffle
        Shuffle();
        System.out.println(card);
    }
 
     public void setImg(){
         
     }
    
    public void Shuffle(){
        //do 52 times
        //Random number from 0 to 51 [any card]
        Random rand = new Random();
        for(int i = 0; i < 51; i++){
            //declare memory
            Card memory = null;
            //get random number
            int j = rand.nextInt((51 - i) + 1) + i;
            //memory = one card
            memory = this.card.get(i);
            //swap the 2 cards
            card.set(i, card.get(j));
            card.set(j, memory);
        }
        System.out.println("Shuffled");
    }
}
