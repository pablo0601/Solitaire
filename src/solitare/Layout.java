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
    Object row[] = new Object [7];
    List<Card> Column1 = new ArrayList<>(); //row[0]
    List<Card> Column2 = new ArrayList<>();
    List<Card> Column3 = new ArrayList<>();
    List<Card> Column4 = new ArrayList<>();
    List<Card> Column5 = new ArrayList<>();
    List<Card> Column6 = new ArrayList<>();
    List<Card> Column7 = new ArrayList<>();
    
    public Layout(){
        Deck d = new Deck();

        for(int i = 0; i < 52; i++){
            System.out.println(d.card[i].ToString());    
            
        }
        int counter = 1;
        for(int j = 0; j < 7; j++){
            for(int i = 0; i < counter; i++){
                switch (counter) {
                    case 1: Column1.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 2: Column2.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 3: Column3.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 4: Column4.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 5: Column5.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 6: Column6.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                    case 7: Column7.add(d.card[i + ((counter^2)/ 2 - (counter/2))]);
                        break;
                } 
            }
            counter++;
        }
        //counter++;   
        
    }
    
    public void PrintGame(){
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
