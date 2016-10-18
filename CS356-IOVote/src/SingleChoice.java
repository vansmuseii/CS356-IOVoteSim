/**
 *      File: SingleChoice.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to control the single choice.
 *
 */

import java.util.HashMap;

public class SingleChoice implements Question{

    // These hash maps are used to store the answers submitted,
    // and the number submitted.

    HashMap<String, String> studentAns = new HashMap<>();
    HashMap<String, Integer> ansBank;
    private String question;

    public SingleChoice (String givenQuestion, String first, String second){
        question = givenQuestion;
        ansBank = new HashMap<>();
        ansBank.put(first, 0);
        ansBank.put(second, 0);
        System.out.printf("The given question is: %s\n", question);
        System.out.printf("The given answers is: %s or %s\n\n", first, second);
    }

    @Override
    public void submit(String studentID, String ans) {
        if(ansBank.containsKey(ans)){
            if(studentAns.get(studentID)!= null){
                System.out.printf("Student %s is changing their answer\n", studentID);
                String change = studentAns.get(studentID);
                ansBank.put(change, ansBank.get(change)-1);
                studentAns.put(studentID, ans);
                ansBank.put(ans, ansBank.get(ans)+1);
            }
            else {
                studentAns.put(studentID, ans);
                ansBank.put(ans, ansBank.get(ans) + 1);
            }
        }
    }

    @Override
    public HashMap submittedAnswers() {
        return studentAns;
    }

    @Override
    public HashMap answerPool(){
        return ansBank;
    }
}
