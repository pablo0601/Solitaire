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
    List<String> card = new ArrayList<>();
  
    public Deck() {
        //for each suit, for each value
        for(Card.Suit s: Card.Suit.values()){
            for(Card.Value v: Card.Value.values()){
                //Create a card in the deck 
                card.add( new Card(s,v).ToString()); 
            }
        }
        
        //gives cards images
      //setImg();
        
        //runs shuffle
        Shuffle();
    }
 
     public void setImg(){
         
     }
    
    public void Shuffle(){
        //do 52 times
        //Random number from 0 to 51 [any card]
        Random rand = new Random();
        for(int i = 0; i < 51; i++){
            //declare memory
            String memory = null;
            //get random number
            int j = rand.nextInt((51 - i) + 1) + i;
            //memory = one card
            memory = this.card.get(i);
            //swap the 2 cards
            card.set(i, card.get(j));
            card.set(j, memory);
        }
    }
}
