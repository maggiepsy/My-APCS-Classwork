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
public class triangle extends shape{
    public triangle(String ashapename,double asidelength){
        super(ashapename,asidelength);
        
    }
    public double area(){
       return getsidelength()/4*1.73;
    }
    
    public double perimeter(){
      return perimeter=3*getsidelength();
    }
}
