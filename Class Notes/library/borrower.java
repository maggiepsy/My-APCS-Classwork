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
public class borrower extends libraryitem{
    public String borrowername;
    public String emailaddress;
    public int borrowerid;
    public int itemsonloan=0;
    
    
    public borrower(String Atitle, String AAuthor, int Aitemid, boolean Aonloan, Date Aduedate,String Aborrowername, String Aemailaddress, int Aborrowerid,int Aitemsonloan){ 
        super(Atitle, AAuthor,Aitemid,Aonloan,Aduedate);
        borrowername=Aborrowername;
        emailaddress=Aemailaddress;
        borrowerid=Aborrowerid;
        itemsonloan=Aitemsonloan;
    }
     
    public String Getborrowername(String Aborrowername) {
         return Aborrowername;
    } 
     
    public String Getemailaddress(String Aemailaddress) {
         return Aemailaddress;
    }   
     
    public int Getborrowerid(int Aborrowerid) {
         return Aborrowerid;
    }   
     
    public int Getitemsonloan(int Aitemsonloan){
         return Aitemsonloan;
    }
     
    public void Updateitemsonloan(){
         itemsonloan++;
    }
    
    public void printdetails(){
    System.out.println("CD title: "+title);
    System.out.println("Artist: "+author);
    System.out.println("ID: "+itemid);
    System.out.println("Onloan: "+onloan);
    System.out.println("Duedate: "+duedate); 
    System.out.println("Borrower: "+borrowername); 
    System.out.println("Emailaddress: "+emailaddress); 
    System.out.println("Borrower id: "+borrowerid); 
    
}

    
}
