/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class Card {
    //Creates Suit Containing all 4 suits
    public enum Suit{
        Spade,
        Club,
        Heart,
        Diamond
    }
    
    //Creates Value Containing all values from Ace to King
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
    
    //make a Suit named suit
    Suit suit;
    //make value named value
    Value value;
    //make BufferedImage
    ImageIcon image;
    
    
    //creates Card of current Suit and Value
    public Card (Suit s, Value v, String path) {
        //set current suit to s
        this.suit = s;
        //set current value to v
        this.value = v;
        
        this.image = new ImageIcon(path);
    }
    
    //to string function
    public String ToString() {
        String s = this.value + " of " + this.suit;
        return s;
    }
    
    
}
