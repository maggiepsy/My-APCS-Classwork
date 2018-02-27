/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mywinterbreakprogram;

/**
 *
 * @author MaggiePu
 */
public class Student {
    private String name;
    private int paper;
    private int act;
    
    public Student(String aName, int aPaper, int aAct){
        name=aName;
        paper=aPaper;
        act=aAct;
    }
    
    public String toString(){
        return name+" "+paper+" "+act;
    }
    
    public void printStudent(){
        System.out.println(this);
    }
    
    public int getscoreEmory(){
        int score=0;
        
        if (paper<10){
           score+=0; 
        }
        else{
           score+=5;
        }
        if (act<=0){
            score+=0;
        }
        else if (act>150){
            score+=3;
        }
        else{
            score+=5;
        }
        return score;
        
    }
    
    public int getscoreUVA(){
        int score=0;
        
        if (paper<5){
           score+=0; 
        }
        else{
           score+=5;
        }
        if (act<=0){
            score+=0;
        }
        else if (act>150){
            score+=3;
        }
        else{
            score+=5;
        }
        return score;
        
    }
    
    public int getscoreJHU(){
        int score=0;
        
        if (paper<20){
           score+=0; 
        }
        else{
           score+=5;
        }
        if (act<=0){
            score+=0;
        }
        else if (act>100){
            score+=3;
        }
        else{
            score+=5;
        }
        return score;
        
    }
    public int getscoreUPENN(){
        int score=0;
        
        if (paper<10){
           score+=0; 
        }
        else if (paper>=10&&paper<=20){
           score+=3;
        }
        else{
            score+=5;
        }
        if (act<=0){
            score+=0;
        }
        else if (act>200){
            score+=3;
        }
        else{
            score+=5;
        }
        return score;
        
    }
    
    
    
    
    
}
