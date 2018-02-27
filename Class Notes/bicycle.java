/*
 * Author: Maggie Pu
Instructor: Mr.Daniel;
Description: This is a class written for the bicycle. 
 */
package classclasswork;
import java.util.*;

/**
 *
 * @author MaggiePu
 */
public class bicycle {
 private int numbike;
 private int numyears;
 private int speed;
 private Random random;
 

public bicycle(){
    numbike=1;
    random=new Random();
}

public bicycle(int n){
    numbike=n;
    random=new Random();
}

public void setnumbike(int n){
    numbike=n;
}

public void setspeed(int n){
    speed=n;
}

public void setyears(int n){
    numyears=n;
}

public int getspeed(){
  int bikespeed=(random.nextInt(speed)+1)*15;
  return bikespeed;
}

public int getdepreciation(){
   int depreciation=0;
   for (int i=1;i<numbike;i++)
       depreciation+=numbike*(random.nextInt(numyears)+1)*20;
   return depreciation;
}

}

