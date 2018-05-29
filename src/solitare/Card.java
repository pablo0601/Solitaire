/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;


public class Card {
    Suit suit;
    Value value;
    public enum Suit{
        Spade,
        Club,
        Heart,
        Diamond
    }
    
    public enum Value{
        Ace,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King
    }
    
    public Card (Suit s, Value v) {
        this.suit = s;
        this.value = v;
    }
    
    
}
