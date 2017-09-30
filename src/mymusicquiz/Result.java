/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusicquiz;

/**
 *
 * @author Ronan
 */
public class Result implements PlayerResult{
 //3 variables
        int totalQuestions;
        int correctAnswers;
        int wrongAnswers;
        int pointsTotal = 0;
        int pointsCorrect = 100;
        int pointsWrong = 0;
        
        /**Create result constructor which takes 3 parameters
        inside intialise the values
        */
        public Result(int totalQuestions,int correctAnswers,int wrongAnswers,int pointsTotal)
        {
            super();
            this.totalQuestions = totalQuestions;
            this.correctAnswers = correctAnswers;
            this.wrongAnswers = wrongAnswers;
            this.pointsTotal = pointsTotal;
        
        }
        
        /**create a method called showResult() to display the result
        entire result displayed
        */
        @Override
        public void showResult()
        {
            System.out.println("Your Result: ");
            System.out.println("Total Questions:        "+totalQuestions);
            System.out.println("Correct Answers:        "+correctAnswers);
            System.out.println("Wrong Answers:          "+wrongAnswers);
            System.out.println("Points Total:           "+pointsTotal);
            //Call percentage method and pass in correct answers and total Quesiotns
            System.out.println("Percentage:             "+showPercentage(correctAnswers,totalQuestions));
            /**Call overall performance call method as a parameter 1st it will return the percentage
            And that percentage will be passed to the Show Performance Method*/
            System.out.println("Overall Performance:    "+showPerformance(showPercentage(totalQuestions,correctAnswers)));
            
 
        }
        
        //percentage Method
        @Override
        public double showPercentage(int correctAnswers, int totalQuestions)
        {
            return ((double)correctAnswers/totalQuestions)*100;
        }
        
        //performance method
        public String showPerformance(double percentage)
        {
            String performance = " ";
            if(percentage > 60)
            {
                performance = "Axe Shredder!!";
            }
            else if (percentage < 40)
            {
                performance = "Total Beginner - you need to learn more!!!";
            }
            else
            {
                performance = "You are Johnny Average";
            }
        
            return performance;
        }

        @Override
        public String showPercentage(double percentage) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        
    
}
