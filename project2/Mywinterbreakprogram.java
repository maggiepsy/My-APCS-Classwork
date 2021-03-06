/*
 * Maggie Pu S3C7
Instructor: Mr.Daniel
Descriptions: This is a program designed to help the colleges to find out their best candidate in the application pool. 
 */
package mywinterbreakprogram;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author MaggiePu
 */
public class Mywinterbreakprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the application select program, please enter the student information. The full score for each school is 10. ");
        System.out.println("Please enter the number of students you want to input information for.");
        int n=input.nextInt();
        ArrayList <String> name=new ArrayList <String> ();
        String hisname=new String();
        int hispaper;
        int hisact;
        /*ArrayList <String> paper=new ArrayList <String> ();
        String hispaper=new String();
        ArrayList <String> act=new ArrayList <String> ();
        String hisact=new String();*/
        
        for (int i=1;i<=n;i++){
        System.out.println("Please enter the information for student "+i+".");
        System.out.println("Name: ");
        hisname=input.next();
        name.add(hisname);   
        System.out.println("Number of papers published during high school: ");
        hispaper=input.nextInt();
        //paper.add(hispaper);
        System.out.println("Activities number*hours: ");
        hisact=input.nextInt();
        //act.add(hisact);
        Student c =new Student(hisname,hispaper,hisact);
        System.out.println("Information for the student: "+c.toString());
        System.out.println("Emory: "+c.getscoreEmory());
        System.out.println("UVA: "+c.getscoreUVA());
        System.out.println("JHU: "+c.getscoreJHU());
        System.out.println("UPENN: "+c.getscoreUPENN());
        
        int max1=Math.max(c.getscoreEmory(), c.getscoreUVA());
        int max2=Math.max(c.getscoreJHU(), c.getscoreUPENN());
        int max3=Math.max(max1, max2);
        System.out.println("The highest score for the student is "+max3+".");
        
        if (max3==c.getscoreEmory()){
            System.out.println("The student should go to Emory.");
        }
        else if (max3==c.getscoreUVA()){
            System.out.println("The student should go to UVA.");
        }
        else if (max3==c.getscoreJHU()){
            System.out.println("The student should go to JHU.");
        }
        else{
            System.out.println("The student should go to UPENN.");
        }
        
        
       
    }
    
}
}
