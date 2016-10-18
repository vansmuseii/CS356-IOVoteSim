/**
 *      File: MultipleChoice.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to have control the multiple choices.
 *
 */

import java.util.Arrays;
import java.util.HashMap;

public class MultipleChoice implements Question{

    // These hash maps are used to store the answers submitted,
    // and the number submitted.

    HashMap<String, String[]> studentAns = new HashMap<>();
    HashMap<String, Integer> ansBank;
    private String question;
    DataStorage d = new DataStorage();

    public MultipleChoice (String givenQuestion, String [] ans){
        question = givenQuestion;
        System.out.printf("The given question is: %s\n", question);
        System.out.printf("The possible answers are: %s", Arrays.toString(ans));
        System.out.println("\n");
        ansBank = new HashMap<>();
        for (String possible:ans)
            ansBank.put(possible.substring(0, 1), 0);
    }

    @Override
    public void submit(String studentID, String ans) {
        String ansArr[] = ans.split(" ") ;
        if(studentAns.get(studentID)!=null){
            System.out.printf("Student %s is changing their answer\n", studentID);
            String change[] = studentAns.get(studentID);
            for (String s: change )
                ansBank.put(s, ansBank.get(s)-1);
            studentAns.remove(studentID);
            studentAns.put(studentID, ansArr);
            for (String s: ansArr)
                ansBank.put(s, ansBank.get(s)+1);
            d.setSubmitted(studentAns);
            d.setPool(ansBank);
        }
        else {
            studentAns.put(studentID, ansArr);
            for (String s : ansArr)
                ansBank.put(s, ansBank.get(s) + 1);
            d.setSubmitted(studentAns);
            d.setPool(ansBank);
        }
    }

    @Override
    public DataStorage getDataStore() {
        return d;
    }
}
