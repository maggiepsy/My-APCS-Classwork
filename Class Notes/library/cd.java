/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycode;

/**
 *
 * @author MaggiePu
 */
public class cd extends libraryitem{
    public String type;
   
   
   public cd(String Atitle, String AAuthor, int Aitemid, boolean Aonloan, int Aduedate,String Atype){ 
        super(Atitle, AAuthor,Aitemid,Aonloan,Aduedate);
        type=Atype;
   }
    
   public String whattype(String Atype) {
         return Atype;
    }   
   
   
public void printdetails(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("ID: "+itemid);
    System.out.println("Onloan: "+onloan);
    System.out.println("Duedate: "+duedate); 
    System.out.println("Type: "+type); 
}

    
}
