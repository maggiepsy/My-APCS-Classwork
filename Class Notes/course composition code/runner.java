/*
 * Author: Maggie
Instructor:Mr. Daniel;
Date: 2018.3.15
Description: This is a program designed to apply the concept of composition. 
 */
package courses;

/**
 *
 * @author MaggiePu
 */
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Courses f=new Courses();
        f.AddLesson("English 101", 290, true);
        f.AddLesson("Comparison politics", 200, false);
        f.OutputCourseDetails();
        
    }
    
}
