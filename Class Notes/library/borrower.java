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
     
    public String Getborrowername() {
         return borrowername;
    } 
     
    public String Getemailaddress() {
         return emailaddress;
    }   
     
    public int Getborrowerid() {
         return borrowerid;
    }   
     
    public int Getitemsonloan(){
         return itemsonloan;
    }
     
    public void Updateitemsonloan(){
         itemsonloan++;
    }
    
    public void printdetails(){
    System.out.println("CD title: "+gettitle());
    System.out.println("Author: "+getauthor());
    System.out.println("ID: "+getitemid());
    System.out.println("Onloan: "+getonloan());
    System.out.println("Duedate: "+getduedate()); 
    System.out.println("Borrower: "+Getborrowername()); 
    System.out.println("Emailaddress: "+Getemailaddress()); 
    System.out.println("Borrower id: "+Getborrowerid()); 
    
}

    
}
