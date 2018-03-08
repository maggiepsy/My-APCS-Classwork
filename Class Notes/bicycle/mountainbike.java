/*
 * Author:Maggie Pu
Instructor: Mr.Daniel
Date: 2018.3.7
Description: This is an extended class for mountainbike in the bike class. 
 */
package classclasswork;

/**
 *
 * @author MaggiePu
 */
public class mountainbike extends bicycle{
    public int wheellevel;
    
    public mountainbike(int anumbike, int anumyears, int aspeed,String abrand, int awheellevel) {
        super(anumbike,anumyears,aspeed,abrand);
        wheellevel=awheellevel;
    }   
    
    public void setwheellevel(int n) {
        wheellevel = n;
    }
    
}
