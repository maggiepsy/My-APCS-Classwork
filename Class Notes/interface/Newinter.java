/*
 * Author: Maggie Pu
Date: 2018.3.14
Instructor:Mr.Daniel
Description: This is a program designed to override the compare method to compare the area of two newly build circle. 
 */
package newinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MaggiePu
 */
public class Newinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     circle c=new circle("circle",4);
     circle x=new circle("circle",7);
     
    
     List l=new ArrayList<circle>();
     l.add(c);
     l.add(x);
     
     Collections.sort(l);
     System.out.print(l);
       
    }
    
}
