/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017frq4;

/**
 *
 * @author MaggiePu
 */
public interface StudyPractice {
       String getProblem();
       void nextProblem();

public class MultPractice implements StudyPractice{
      private int first;
      private int second;

public MultPractice(int num1, int num2){
    first = num1;
    second = num2;
}

public String getProblem(){
    return first+ "Times" +second;
}

public void nextProblem(){
     second++;  
}

}

}
