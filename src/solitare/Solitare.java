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
public class Solitare {
    
    static List<String> cards = new ArrayList<String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck d = new Deck();
        for(int i = 0; i < 52; i++){
            System.out.println(d.c[i].ToString());                  
        }
    }
    
}
