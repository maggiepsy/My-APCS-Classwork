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
public class Pizza {
    int number;
   
   public Pizza(int r){
       this.number=r;
   }
   
   public double price(){   
    double price=this.number*5;
    return price;
    }
   
    public double makingtime(){
       double time=20*this.number;
       return time;
   }
   
    public double Calories(){
       double calories=240*this.number;
       return calories;
    }
}
