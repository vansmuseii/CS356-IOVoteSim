/**
 *      File: SimulationDriver.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file runs the whole program.
 *
 */

import java.util.*;

public class SimulationDriver {
    public static void main(String [] args){
        Random r = new Random();
        Question question;
        Scanner keyBoard = new Scanner(System.in);
        IVoteService iVote = new IVoteService();

        System.out.print("Please enter your choice: (1) Single Choice or (2) Multiple Choice: ");
        int choice = keyBoard.nextInt();
        System.out.print("\n");
        switch (choice){
            case 1:
                question = iVote.newQuestion("What is the weather like today?", "Hot", "Cold");
                for (int i = 0; i < 30; i++) {
                    String ans [] = {"Hot", "Cold"};
                    Student stud = new Student();
                    iVote.submitAnswers(stud.getID(), ans[r.nextInt(2)], question);
                }
                iVote.showLiveData(question);
                iVote.showResults(question);
                break;
            case 2:
                String[] poll = {"A: 1", "B: 3", "C: 7", "D: 9", "E: 11", "F: 31"};
                question = iVote.newQuestion("What number am I thinking of?", poll );
                for (int i = 0; i < 30; i++) {
                    Student stud = new Student();
                    ArrayList<String> ans = new ArrayList<>();
                    ans.add("A");
                    ans.add("B");
                    ans.add("C");
                    ans.add("D");
                    ans.add("E");
                    ans.add("F");
                    String [] testArr = {"A", "B", "C", "D", "E", "F"};
                    for (int j = 0; j < 5; j++) {
                        String testStr = testArr[r.nextInt(6)];
                        if (ans.contains(testStr))
                            ans.remove(ans.indexOf(testStr));
                    }
                    String submit = "";
                    for (String grab: ans){
                        submit = submit + " " + grab;
                    }
                    iVote.submitAnswers(stud.getID(),submit.substring(1,submit.length()), question);
                }
                iVote.showLiveDateMul(question);
                iVote.showResults(question);
                break;
            default:
                System.out.println("Invalid input! Closing!");
                keyBoard.next();
        }
    }
}