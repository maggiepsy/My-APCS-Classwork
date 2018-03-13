/*
 * Maggie Pu S3C7
Instructor: Mr.Daniel
Description: A class for the shape to run different functions.
 */
package shape;

/**
 *
 * @author MaggiePu
 */
public class circle {
   int radius;
   
   public circle(int r){
       this.radius=r;
   }
   
   public double getarea(){   
    double area=this.radius*this.radius*Math.PI;
    return area;
    }
   
   public double circum(){
       double circumm=2*this.radius*Math.PI;
       return circumm;
   }
   
   
   
}
