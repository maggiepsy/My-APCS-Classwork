/*
 * Author: Maggie
Instructor:Mr. Daniel;
Date: 2018.3.15
Description: This is the class lesson.
 */
package courses;

/**
 *
 * @author MaggiePu
 */
public class Lesson {
    private String LessonTitle;
    private int DurationMinutes;
    private boolean RequiresLab;
    
    public Lesson(){
        LessonTitle="";
        DurationMinutes=100;
        RequiresLab=false;
    }
    
    public  Lesson(String aLessontitle,int adurationmin,boolean arequires){
        LessonTitle=aLessontitle;
        DurationMinutes=adurationmin;
        RequiresLab=arequires;  
    }
    
    public String ToString(){
        return "Lesson Title: "+LessonTitle+"\nDuration Minutes: "+DurationMinutes+"\nRequires Lab: "+RequiresLab;
    }
    
    public void OutputLessonDetails(){
        System.out.println("Lesson Title: "+LessonTitle+"\nDuration Minutes: "+DurationMinutes+"\nRequires Lab: "+RequiresLab);
    }
    
    
}
