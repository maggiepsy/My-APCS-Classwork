/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycode;

import java.util.Date;

/**
 *
 * @author MaggiePu
 */
public class book extends libraryitem{
   public boolean requested;
   
   
   public book(String Atitle, String AAuthor, int Aitemid, boolean Aonloan, Date Aduedate,boolean Isrequested){ 
        super(Atitle, AAuthor,Aitemid,Aonloan,Aduedate);
        requested=Isrequested;
   }
    
   public void requested(boolean X) {
         requested=X;
    }   
   
   
public void printdetails(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("ID: "+itemid);
    System.out.println("Onloan: "+onloan);
    System.out.println("Duedate: "+duedate); 
    System.out.println("Requested: "+requested); 
}

}
