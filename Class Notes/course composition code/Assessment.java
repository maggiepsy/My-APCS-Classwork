/*
 * Author: Maggie
Instructor:Mr. Daniel;
Date: 2018.3.15
Description: This is the class assessment.
 */
package courses;

/**
 *
 * @author MaggiePu
 */
public class Assessment {
    private String AssessmentTitle;
    private int MaxMarks;
    
    public Assessment(){
        AssessmentTitle="";
        MaxMarks=100;
    }
    
    public Assessment(String Aassessmentt, int amax){
       AssessmentTitle= Aassessmentt;
       MaxMarks=amax;
    }
    
    public String toString ()
    {
       return "Assessment Title: "+this.AssessmentTitle+"\nMaxium Mark: "+this.MaxMarks;
    }
    public void OutputAssessmentDetails(){
       System.out.println("Assessment Title: "+this.AssessmentTitle+"\nMaxium Mark: "+this.MaxMarks); 
    }
}
