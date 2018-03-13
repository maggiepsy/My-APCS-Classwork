/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape2;

/**
 *
 * @author MaggiePu
 */
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       circle x=new circle("Circle",2); 
       x.getshapename();
       x.getarea();
       x.getperimeter();
       
       System.out.println();
       
       triangle z=new triangle("Triangle",5);
       z.getshapename();
       z.getarea();
       z.getperimeter();
       
       System.out.println();
       
       square y=new square("Square",8);
       y.getshapename();
       y.getarea();
       y.getperimeter();
    }
    
}
