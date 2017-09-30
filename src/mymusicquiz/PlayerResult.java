/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusicquiz;


public interface PlayerResult {
    
    
        void showResult();
        double showPercentage(int correctAnswers, int totalQuestions);
        String showPercentage(double percentage);
    
    
    
}
