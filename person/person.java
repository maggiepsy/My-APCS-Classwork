/*
 * Maggie Pu S3C7
Instructor: Mr. Daniel
Description: This is a program that designed for a object and class person program. 
 */
package objectclasspractice;

/**
 *
 * @author MaggiePu
 */
public class person {
    
    int age=0;
    
    public String language;
    
    public void sayHello(){
        if (this.language.equals("English"))
            System.out.println("Hello World"+" I am "+age);
        else
            System.out.println("Nihao"+" I am "+age);
    }
    
    public void sayGoodbye(){
        if (this.language.equals("English"))
            System.out.println("Goodbye");
        else
            System.out.println("Zaijian");
    }
    

    public person(String language){
       this.language=language;
    }
    
    public void grow(int howmuch){
        age+=howmuch;
    }
    
    /*
    public String getGreeting(){
        if (this.age<3){
            return "x";
        }else if(this.language.equals("English"))
            return "Hello I am "+ this.age+" years old";
       
   
        
    
     }
    /*
    
    public void setLanguage(String x){
        this.language=x;
    */

}
