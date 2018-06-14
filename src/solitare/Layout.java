/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitare;

import java.util.ArrayList;
import java.util.List;

public class Layout {
    //Variable Decleration
    public Deck d;
    
    //All Cards Layed Out And Visible
    Object row[] = new Object [7];
    List<Card> Column1 = new ArrayList<>();
    List<Card> Column2 = new ArrayList<>();
    List<Card> Column3 = new ArrayList<>();
    List<Card> Column4 = new ArrayList<>();
    List<Card> Column5 = new ArrayList<>();
    List<Card> Column6 = new ArrayList<>();
    List<Card> Column7 = new ArrayList<>();
    
    //Only Displayes top card of stack
    Object visible[] = new Object[7];
    List<Card> VisColumn1 = new ArrayList<>();
    List<Card> VisColumn2 = new ArrayList<>();
    List<Card> VisColumn3 = new ArrayList<>();
    List<Card> VisColumn4 = new ArrayList<>();
    List<Card> VisColumn5 = new ArrayList<>();
    List<Card> VisColumn6 = new ArrayList<>();
    List<Card> VisColumn7 = new ArrayList<>();
    
    public Layout(){
        //creates new deck
        d = new Deck();
        PlayGame p;
        p = new PlayGame(d.card.get(0));
        p.setVisible(true);
        //declares Counter for number of cards in each stack
        int counter = 1;
        for(int j = 0; j < 7; j++){
            for(int i = 0; i < counter; i++){
                //switch and case for what column to put the cards in
                switch (j) {
                    
                    //column 1
                    case 0: Column1.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 2
                    case 1: Column2.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 3
                    case 2: Column3.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 4
                    case 3: Column4.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 5
                    case 4: Column5.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 6
                    case 5:
                      Column6.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                        
                    //Column 7
                    case 6:
                       Column7.add(d.card.get(0));
                        d.card.remove(0);
                        break;
                }
            }
            //For each time through add 1 to Counter
        counter++;
        }
        
    }
    
    
    
    public void FirstTimePrint(){
//---------------------------------------------------------------------------------------------//
//        //For Each item in Columns, add ? to the visible column of each same number
//        
//        Column1.forEach((_item) -> {
//      //      VisColumn1.add("?");   
//        });
//        //set Last item in Visible Column to last item in Column
//        VisColumn1.set(Column1.size() - 1,Column1.get(Column1.size() - 1));
//        
//        Column2.forEach((_item) -> {
//     //       VisColumn2.add("?");
//        });
//        VisColumn2.set(Column2.size() - 1,Column2.get(Column2.size() - 1));
//        
//        Column3.forEach((_item) -> {
//    //        VisColumn3.add("?");
//        });
//        VisColumn3.set(Column3.size() - 1,Column3.get(Column3.size() - 1));
//        
//        Column4.forEach((_item) -> {
//      //      VisColumn4.add("?");
//        });
//        VisColumn4.set(Column4.size() - 1,Column4.get(Column4.size() - 1));
//        
//        Column5.forEach((_item) -> {
//       //     VisColumn5.add("?");
//        });
//        VisColumn5.set(Column5.size() - 1,Column5.get(Column5.size() - 1));
//        
//        Column6.forEach((_item) -> {
//         //   VisColumn6.add("?");
//        });
//        VisColumn6.set(Column6.size() - 1,Column6.get(Column6.size() - 1));
//        
//        Column7.forEach((_item) -> {
//            //VisColumn7.add("?");
//        });
//        VisColumn7.set(Column7.size() - 1,Column7.get(Column7.size() - 1));
//---------------------------------------------------------------------------------------------//
        //Putting Columns into row [Creating 2d array?]
        row[0] = Column1;
        row[1] = Column2;
        row[2] = Column3;
        row[3] = Column4;
        row[4] = Column5;
        row[5] = Column6;
        row[6] = Column7;
        
        //Putting Visible Columns into visible row [Creating 2d array?]
//        visible[0] = VisColumn1;
//        visible[1] = VisColumn2;
//        visible[2] = VisColumn3;
//        visible[3] = VisColumn4;
//        visible[4] = VisColumn5;
//        visible[5] = VisColumn6;
//        visible[6] = VisColumn7;
//
        //Prints out emoty line then Layout
        System.out.println();
        for(int i = 0; i < 7; i ++){
            System.out.println(row[i]);
        }
        
    }
    

}
