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
public class Layout {
    static Object row[] = new Object [7];
    static List<String> Column1 = new ArrayList<String>(); //row[0]
    static List<String> Column2 = new ArrayList<String>();
    static List<String> Column3 = new ArrayList<String>();
    static List<String> Column4 = new ArrayList<String>();
    static List<String> Column5 = new ArrayList<String>();
    static List<String> Column6 = new ArrayList<String>();
    static List<String> Column7 = new ArrayList<String>();
    
    public Layout(){
        Deck d = new Deck();

        for(int i = 0; i < 52; i++){
            System.out.println(d.c[i].ToString());    
            
        }
        int counter = 1;
        for(int i = 0; i < counter; i++){
            Column1.add(Deck[i]);
        }
        counter++;
        
    }
    
    public static void PrintGame(){
        row[0] = Column1.toArray();
        row[1] = Column1.toArray();
        row[2] = Column1.toArray();
        row[3] = Column1.toArray();
        row[4] = Column1.toArray();
        row[5] = Column1.toArray();
        row[6] = Column1.toArray();
        
        for(int i = 0; i > 7; i ++){
            System.out.println(row[i]);
        }
    }
    

}
