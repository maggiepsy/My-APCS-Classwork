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
public class circle extends shape implements Comparable{
    
    public circle(String ashapename,int asidelength){
        super(ashapename,asidelength);
        
    }

    public int compareTo(Object c){
    circle a=(circle) c;
    return this.area()-a.area();
    }
    
    public int area(){
        int area;
        area=sidelength*sidelength*3;
        return area;
    }     
    
    public int perimeter() {
        int perimeter;
        perimeter=2*sidelength*2;
        return perimeter;
    }
    
    public String toString(){
        return "area "+this.area();
    }
}
