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
public class circle extends shape{
    public circle(String ashapename,double asidelength){
        super(ashapename,asidelength);
        
    }
    public double area(){
       return Math.PI*getsidelength()*getsidelength();
    }
    
    public double perimeter(){
      return perimeter=2*Math.PI*getsidelength();
    }
}
