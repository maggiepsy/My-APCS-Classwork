/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newinter;

/**
 *
 * @author MaggiePu
 */
public abstract class shape {
    private String shapename;
    public int sidelength;
    public int area;
    public int perimeter;
    
    public shape(String ashapename,int asidelength){
     shapename=ashapename;
     sidelength=asidelength;
    }
    
    public int getsidelength(){
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
    
    public abstract int area();
    
    public abstract int perimeter();    
    
}
