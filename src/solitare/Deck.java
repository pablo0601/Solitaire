/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michael.pierik700
 */
public class Deck {
    Card[] c = new Card[52];
    public Deck() {
        int i = 0;
        for(Card.Suit s: Card.Suit.values()){
            for(Card.Value v: Card.Value.values()){
                c[i] = new Card(s, v);
                i++;
            }
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