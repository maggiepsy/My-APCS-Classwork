/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasproject;
import java.util.Scanner;
/**
 *
 * @author MaggiePu
 */
public class Christmasproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to your lunch picking program.");
       System.out.println("In this program, we will help you calculate the time and price for the dish you want to have.");
       System.out.println("Choose 1 if you want pizza, choose 2 for porridge.");
       int x=input.nextInt();
       
       if (x==1){
       System.out.println("Please enter the ingredients you want to have.1 stands for mushrooms, 2 stands for pineapple, 3 stands for cheese.");
       int eat=input.nextInt();
       if (eat==1){
           System.out.println("You choose seafood pizza, please enter the number you want to have.");
           }
        if (eat==2){
           System.out.println("You choose Havaii pizza, please enter the number you want to have.");
           }
        if (eat==3){
           System.out.println("You choose cheese pizza, please enter the number you want to have.");
           }
          int number=input.nextInt();
           Pizza C= new Pizza(number);
           System.out.println("The price is "+C.price()+" dollars.");
           System.out.println("The waiting time is "+C.makingtime()+" minutes.");
           System.out.println("The total calories is "+C.Calories()+" calories.");
       }
       
       if (x==2){
       System.out.println("Please enter the ingredients you want to have.1 stands for red beans, 2 stands for greenbeans, 3 stands for blackbeans.");
       int eat=input.nextInt();
       if (eat==1){
           System.out.println("You choose red beans porridge, please enter the number you want to have.");
           }
        if (eat==2){
           System.out.println("You choose green beans porridge, please enter the number you want to have.");
           }
        if (eat==3){
           System.out.println("You choose black beans porridge, please enter the number you want to have.");
           }
          int number=input.nextInt();
           porridge C= new porridge(number);
           System.out.println("The price is "+C.price()+" dollars.");
           System.out.println("The waiting time is "+C.makingtime()+" minutes."); 
           System.out.println("The total calories is "+C.Calories()+" calories.");
       }
       
    }
    
}
