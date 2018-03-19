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
       shape x=new circle("Circle",2); 
       shape l=new circle("Circle",6);
       x.getshapename();
       System.out.println("The area is "+x.area());
       System.out.println("The perimeter is "+x.perimeter());
       System.out.println();
       
       triangle z=new triangle("Triangle",5);
       z.getshapename();
       System.out.println("The area is "+z.area());
       System.out.println("The perimeter is "+z.perimeter());
       
       System.out.println();
       
       square y=new square("Square",8);
       y.getshapename();
        System.out.println("The area is "+y.area());
       System.out.println("The perimeter is "+y.perimeter());
    }
    
}
