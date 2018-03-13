/*
 *Author: Maggie Pu
Instructor:Mr. Daniel
Date:2018.3.13
Description: This is a program designed to test the understanding of abstract classes.
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
