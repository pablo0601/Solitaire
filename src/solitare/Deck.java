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
    List<Card> card = new ArrayList<>();
    
    public Deck() {
       // int i = 0;
        for(Card.Suit s: Card.Suit.values()){
            for(Card.Value v: Card.Value.values()){
                
                card.add( new Card(s,v)); 
                //card[i] = new Card(s, v);
               // i++;
            }
        }
        Shuffle();
    }
 
    public void Shuffle(){
        Random rand = new Random();
        for(int i = 0; i < 51; i++){
            Card memory = null;
            int j = rand.nextInt((51 - i) + 1) + i;
            memory = this.card.get(i);
            card.set(i, card.get(j));
            card.set(j, memory);
            
            //this.card[i] = this.card[j];
            //this.card[j] = memory;
        }
        
        
    }
//    Card AofS = new Card(Card.Suit.Spade, Card.Value.Ace);
//    Card TwoofS = new Card(Card.Suit.Spade, Card.Value.Two);
//    Card ThreeofS = new Card(Card.Suit.Spade, Card.Value.Three);
//    
//    public static void Listing(){
//    
//        
//    }
}
