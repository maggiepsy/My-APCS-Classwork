/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2017frq2;

/**
 *
 * @author MaggiePu
 */
public class Phrase {
    private String currentPhrase;
    public Phrase(String p){
        currentPhrase= p;
    }
    
    public int findNthoccurence(String str,int n, String repl){
       int index = findNthoccurence(String str, int n);
       if(index != 1){
          currentPhrase = currentPhrase.substring(0, index)+repl+currentPhrase.substring(index,str.length());
       }
        
    }
    
    public int findLastoccurrence(String str){
       int n = 1;
       while (findNthoccurrence(str, n+1) != -1)
       { n++;
       }
    return findNthoccurrence(str, n); 
    }
    
}
