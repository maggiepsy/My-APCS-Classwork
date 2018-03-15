/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
