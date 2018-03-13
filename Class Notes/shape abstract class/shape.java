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
public abstract class shape {
    private String shapename;
    private double sidelength;
    public double area;
    public double perimeter;
    
    public shape(String ashapename,double asidelength){
     shapename=ashapename;
     sidelength=asidelength;
    }
    
    public double getsidelength(){
        return sidelength;
    }
    
    public void getarea(){
        System.out.println("The area is "+area());
    }
    
    public void getperimeter(){
        System.out.println("The perimeter is "+perimeter());
    }
    
    public void getshapename(){
        System.out.println("The shape is "+shapename);
    }
    
    public abstract double area();
    
    public abstract double perimeter();    
    }
    
    

