/**
*
*A program that will represent a current grade in COMP 1210.
*
*Activity_04B
*@author Tanner Bonds
*@version 10-1-17
*
*/

public class Grade {

/*
*
*Represents a grade in COMP 1210.
*
*/
   //instance variables
   private double exam1, exam2, finalExam = 0;
   private double activityAvg = 0;
   private double quizAvg = 0;
   private double projectAvg = 0;
   private String studentName = "";
   
   /**
   *
   *Constants for examType.
   *
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   
   /**
   *Constants for calculating grade.
   *
   */
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30,
      ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
 
      //constructor
   
      /**
      *
      *Accepts a student name as a parameter.
      *
      *@param studentNameIn Command line arguments - not used.
      *
      */
   
   public Grade(String studentNameIn) {
      
      studentName = studentNameIn;
      
   }
      
     
     //methods
     
     /**
     *
     *sets the values of activityAvg and quizAvg.
     *
     *@param activityAvgIn Command line arguments - not used.
     *@param quizAvgIn Command line arguments - not used.
     *
     */
       
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
    
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
    
   } 
   
   /**
   *
   *sets the value of projectAvg.
   *
   *@param projectAvgIn Command line arguments - not used.
   *
   */

   public void setProjectAvg(double projectAvgIn) {
   
      projectAvg = projectAvgIn;
   
   }
   
   
   
   /**
   *
   *sets the value of ExamScore.
   *
   *@param examType Command line arguments - not used.
   *@param examScoreIn Command line argumetns - not used.
   *
   */
      
   public void setExamScore(int examType, double examScoreIn) {
     
      if (examType == 1) {
      
         exam1 = examScoreIn;
      
      }
      
      else if (examType == 2) {
      
         exam2 = examScoreIn;
      
      } 
      
      else if (examType == 3) {
      
         finalExam = examScoreIn;
      
      }
      
   }
   
   /**
   *
   *returns a double representing a grade..
   *
   *@return calculateGrade 
   *
   */

   public double calculateGrade() {
   
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
   
      return grade;
   
   }
   
   /**
   *
   *Returns a string.
   *
   *@return toString.
   *
   */

   public String toString() {
      
      return "Name: " + studentName + "\n" 
         + "Course Grade: " + calculateGrade();
      
   }
   
   
}