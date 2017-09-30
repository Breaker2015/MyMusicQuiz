/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusicquiz;

import java.util.Scanner;

/**
 *
 * @author Ronan
 */
public class Quiz {
      void startQuiz()
        {
    
                /**create 5 question objects 
                inside their constructors passed values
                1. the question 2. the options for the question 3. answer for the question
                create an answer object and inside it pass the answer string
                answer object will be create in memory and the answer variables will be loaded with the value passed into the constructor
                */
        
                Question q1 = new Question("One of the three noted guitarists to have played with The Yardbirds?","Jimi Hendrix", "Pete Townshend", "Jimmy Page","Keith Richards",new Answer("Jimmy Page"));
                Question q2 = new Question("Born November 27th 1942 in Seattle?", "Jimi Hendrix", "Eric Clapton", "Duane Allman", "Buddy Guy",new Answer("Jimi Hendrix"));
                Question q3 = new Question("An accomplished painter and member of Manchester quartet?", "Noel Gallagher", "John Power", "John Squire", "Bernard Butler",new Answer("John Squire"));
                Question q4 = new Question("Founded the band Taste in the 60's", "Van Morrison", "Rory Gallagher", "Jeff Beck", "George Harrison",new Answer("Rory Gallagher"));
                Question q5 = new Question("Part of hugely successful writing partnership during the 1980's ", "Paul McCartney", "Pete Shelley", "Clint Boom", "Jonny Marr",new Answer("Jonny Marr"));
    
                       
                /**create an Question array to store the questions 
                 */
                Question questionsArr[] = {q1,q2,q3,q4,q5};
                /**create 3 variables
                total number of questions 
                */
                int countTotal = 0;
                /**total number of questions correct
                 */
                int countCorrect = 0;
                /**total number of questions wrong 
                */
                int countWrong = 0;
                
                //Create Points total
                int pointsTotal = 0;
                int pointsCorrect = 0;
                int pointsWrong = 0;
                
                /**for each loop to go through entire question array
                for each question in the array - do the following
                */
                for (Question q:questionsArr)
                {
                    /**print the actual question - method present in the question class
                     */
                    System.out.println(q.getQuesiton());
                    /**display the options for the question
                     */
                    System.out.println("A. "+q.getOption1());
                    System.out.println("B. "+q.getOption2());
                    System.out.println("C. "+q.getOption3());
                    System.out.println("D. "+q.getOption4());
                    /**ask user to enter an option
                     */
                   
            
                    //Answer Section
                    System.out.println("\nPlease select an option...");
                    
                    /**Get input from the user using Scanner Object
                     */
                    Scanner scanner = new Scanner(System.in);
                    /**take one character from the user
                     */
                    char option = scanner.next().charAt(0);
                    /**declare answer variable which is local to this method
                     */
                    String answer ="";
                    
                    /**Use a Switch Statement
                    pass the option which the user selects
                    * if option is A the answer 
                    * get the answer from Option1 and so on
                    */
                    switch(option)
                    { 
                        case 'A' :
                            answer=q.getOption1();
                            break;
                        case 'B' :
                            answer=q.getOption2();
                            break;
                        case 'C' :
                            answer=q.getOption3();
                            break;
                        case 'D' :
                            answer=q.getOption4();
                            break;
                        default:break;
                    }
                    /**Check whether the answer the user has entered matches with the actual answer of that question
                    comparing Strings - use .equals method()
                    1. q is question object
                    2. answer is the answer variable of that question object
                    3. getAnswer is the method from the answer class
                    so it gets the actual answer of that particular question
                    4. if answer matches - display message : "Correct answer"
                    5. if answer does not match - display message : "Wrong answer"
                    */
                    if(answer.equals(q.answer.getAnswer()))
                    {
                        System.out.println("--------------------------------");
                        System.out.println("Correct Answer");
                        pointsTotal+=100;
                        System.out.println("Well done you have scored " + pointsTotal + " points");
                        System.out.println("--------------------------------");
                        /**increment countCorrect by 1 = user has entered 1 correct answer
                         */
                        countCorrect++; 
                        pointsCorrect++;
                         /**increment pointsTotal by 1 = user has entered 1 correct answer
                         */
                      
                    }
                    //for wrong answer
                    else
                    {
                        System.out.println("-------------------------------");
                        System.out.println("Wrong Answer");
                        System.out.println("-------------------------------");
                        /**increment countWrong by 1 = user has entered 1 wrong answer
                         */
                        countWrong++;
                    }
                    
                    System.out.println("\n=====================================================================\n");
                    
                    //Increment the total count Variable
                    countTotal++;
                    }
                    
                    
                
                /**Write result and pass in values: countTotal, countCorrect, countWrong
                interface reference can point to a object which implements that interface
                */
                PlayerResult result = new Result(countTotal,countCorrect,countWrong,pointsTotal);
                result.showResult();
         
        }//startQuiz()
      
   }//Class Quiz
