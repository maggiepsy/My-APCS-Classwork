/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycode;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author MaggiePu
 */
public class libraryitem {
    public String title;
    public String author;
    public int itemid;
    public boolean onloan;
    public Date duedate;
    public int currenttime;
    
    
public libraryitem(String Atitle, String AAuthor, int Aitemid, boolean Aonloan, Date Aduedate){
    title=Atitle;
    author=AAuthor;
    itemid=Aitemid;
    onloan=Aonloan;
    duedate=Aduedate;
}

private static Date addDays(Date date,int days){
   GregorianCalendar cal= new GregorianCalendar();
   cal.setTime(date);
   cal.add(Calendar.DATE,days);
   
   return cal.getTime();
   
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

public Date duedate(){
    return duedate;
}

public void borrowing(){
    onloan=true;    
    Date today=new Date();
    duedate=addDays(today,14);
}

public void returning(){
    onloan=false;
}

public void printdetails(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("ID: "+itemid);
    System.out.println("Onloan: "+onloan);
    System.out.println("Duedate: "+duedate); 
}


}
