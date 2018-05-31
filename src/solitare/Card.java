/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;


public class Card {
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
    
    Suit suit;
    Value value;
    
    public Card (Suit s, Value v) {
        this.suit = s;
        this.value = v;
    }
    
    public String ToString() {
        String s = this.value + " of " + this.suit;
        return s;
    }
    
    
}
