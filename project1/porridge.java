/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasproject;

/**
 *
 * @author MaggiePu
 */
public class porridge {
    int number;
   
   public porridge(int r){
       this.number=r;
   }
   
   public double price(){   
    double price=this.number*10;
    return price;
    }
   
    public double makingtime(){
       double time=30*this.number;
       return time;
   }  
    
    public double Calories(){
       double calories=220*this.number+50;
       return calories;
    }
}
