/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017frq1;

import java.util.ArrayList;

/**
 *
 * @author MaggiePu
 */
public class Digits {
    private ArrayList<Integer> digitList;
    
public Digits(int num)
    { 
        digitList=new Arraylist<Integer>();
        
        if (num==0){
          digitList.add(new Integer(0));  
        }
        
        if (num>=0){
            digitList.add(0,new Integer(num%10));
            num/=10;
        }
        
        
    }
        public boolean isStrictlyIncreasing(){
            for (int i=0;i<digitList.size()-1;i++){
                if (digitList.get(i+1)>=digitList.get(i)){
                    return true;
                }
                else
                    return false;
            }
        }
}
                                                                                                          