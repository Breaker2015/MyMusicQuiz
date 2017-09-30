/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusicquiz;


public class Question {
    
   //var for question
    String quesiton;
    //var for options
    String option1;
    String option2;
    String option3;
    String option4;
    
    /**created separate class to hold the answer
    add reference of that answer to the question class;
    */
    Answer answer;
    
    //create constructor

    public Question(String quesiton, String option1, String option2, String option3, String option4, Answer answer) {
        this.quesiton = quesiton;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }
    
    /**create getter methods for the variables
     */

    public String getQuesiton() {
        return quesiton;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public Answer getAnswer() {
        return answer;
    }
    
    
  
}//End Class Question

