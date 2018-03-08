/*
 *Author: Maggie Pu
Instructor: Mr.Daniel
Date: 2018.3.7
Description: This is a program designed to check information of borrowing books and cds in the library. 
 */
package librarycode;

import java.util.Date;

/**
 *
 * @author MaggiePu
 */
public class Librarycode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        libraryitem b = new book("12 Rules for Life", "Jordan Peterson", 1235, false, new Date(),false);
        b.borrowing();
        b.printdetails();
        
        System.out.println();
        
        cd g=new cd("And Justice for all","Metallica",2543,false,new Date(),"metal");
        g.borrowing();
        g.printdetails();
        
        
        
    }
    
}
