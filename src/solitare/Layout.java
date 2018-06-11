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
    
    List<String> Column1 = new ArrayList<>(); //row[0]
    List<String> Column2 = new ArrayList<>();
    List<String> Column3 = new ArrayList<>();
    List<String> Column4 = new ArrayList<>();
    List<String> Column5 = new ArrayList<>();
    List<String> Column6 = new ArrayList<>();
    List<String> Column7 = new ArrayList<>();
    
    Object visible[] = new Object[7];
    List<String> VisColumn1 = new ArrayList<>(); //row[0]
    List<String> VisColumn2 = new ArrayList<>();
    List<String> VisColumn3 = new ArrayList<>();
    List<String> VisColumn4 = new ArrayList<>();
    List<String> VisColumn5 = new ArrayList<>();
    List<String> VisColumn6 = new ArrayList<>();
    List<String> VisColumn7 = new ArrayList<>();
    
    public Layout(){
        Deck d = new Deck();

//        for(int i = 0; i < 52; i++){
//            System.out.println(d.card.get(i));    
//
//        }

        int counter = 1;
        for(int j = 0; j < 7; j++){
            for(int i = 0; i < counter; i++){
                switch (j) {
                    case 0: Column1.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 1: Column2.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 2: Column3.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 3: Column4.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 4: Column5.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 5:
                      Column6.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                    case 6:
                       Column7.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                }
            //System.out.println(d.card.size());
            }
        counter++;
        }
    }
    
    
    
    public void PrintGame(){
        Column1.forEach((_item) -> {
            VisColumn1.add("?");   
        });
        VisColumn1.set(Column1.size() - 1,Column1.get(Column1.size() - 1));
        
        Column2.forEach((_item) -> {
            VisColumn2.add("?");
        });
        VisColumn2.set(Column2.size() - 1,Column2.get(Column2.size() - 1));
        
        Column3.forEach((_item) -> {
            VisColumn3.add("?");
        });
        VisColumn3.set(Column3.size() - 1,Column3.get(Column3.size() - 1));
        
        Column4.forEach((_item) -> {
            VisColumn4.add("?");
        });
        VisColumn4.set(Column4.size() - 1,Column4.get(Column4.size() - 1));
        
        Column5.forEach((_item) -> {
            VisColumn5.add("?");
        });
        VisColumn5.set(Column5.size() - 1,Column5.get(Column5.size() - 1));
        
        Column6.forEach((_item) -> {
            VisColumn6.add("?");
        });
        VisColumn6.set(Column6.size() - 1,Column6.get(Column6.size() - 1));
        
        Column7.forEach((_item) -> {
            VisColumn7.add("?");
        });
        VisColumn7.set(Column7.size() - 1,Column7.get(Column7.size() - 1));
        
        row[0] = Column1;
        row[1] = Column2;
        row[2] = Column3;
        row[3] = Column4;
        row[4] = Column5;
        row[5] = Column6;
        row[6] = Column7;
        
        visible[0] = VisColumn1;
        visible[1] = VisColumn2;
        visible[2] = VisColumn3;
        visible[3] = VisColumn4;
        visible[4] = VisColumn5;
        visible[5] = VisColumn6;
        visible[6] = VisColumn7;

//        for(int i = 0; i < 7; i ++){
//            System.out.println(row[i]);
//        }
        System.out.println();
        for(int i = 0; i < 7; i ++){
            System.out.println(visible[i]);
        }
    }
    

}
