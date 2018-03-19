/*
 * Author: Maggie
Instructor:Mr. Daniel;
Date: 2018.3.15
Description: This is the class courses.
 */
package courses;

import java.sql.Array;

/**
 *
 * @author MaggiePu
 */
public class Courses {
    private String CourseTitle;
    private int MaxStudents;
    private int NumberOfLessons;
    private Assessment CourseAssessment;
    private Lesson [] lesson;
               
    public Courses(){
       lesson= new Lesson [20];
        NumberOfLessons=0;
        CourseAssessment=new Assessment();
    }
    
    public void AddLesson(String title, int min, boolean ab){
        Lesson x=new Lesson(title, min, ab);
        lesson [NumberOfLessons]=x;
        NumberOfLessons++;
        
    }
    
    public void AddAssessment(String title, int score){
        CourseAssessment=new Assessment(title, score);
    }
    
    public void OutputCourseDetails(){
      String printD = "";
        for (int i=0; i<NumberOfLessons; i++)
        {
            printD = printD + "Lesson "+(i+1)+"\n"+lesson[i].ToString()+"\n";
        }
        System.out.println("Course\n\nLesson Details: \n"+printD+"\nAssesment Details: \n"+CourseAssessment);
    }
    
    
}
