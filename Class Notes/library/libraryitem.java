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
public class libraryitem {
    public String title;
    public String author;
    public int itemid;
    public boolean onloan;
    public int duedate;
    public int currenttime;
    
    
public libraryitem(String Atitle, String AAuthor, int Aitemid, boolean Aonloan, int Aduedate){
    title=Atitle;
    author=AAuthor;
    itemid=Aitemid;
    onloan=Aonloan;
    duedate=Aduedate;
}

public String gettitle(){
    return title;
}
public String getauthor(){
    return author;
}

public int getitemid(){
    return itemid;
}

public boolean getonloan(){
    return onloan;
}

public int duedate(){
    return duedate;
}

public void borrowing(){
    onloan=true;    
    duedate=10;
}

public void returning(){
    onloan=false;
    duedate=0;
}

public void printdetails(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("ID: "+itemid);
    System.out.println("Onloan: "+onloan);
    System.out.println("Duedate: "+duedate); 
}

}
