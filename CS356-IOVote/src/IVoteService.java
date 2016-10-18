/**
 *      File: IVoteService.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to be the IVote Service, where it accepts input from
 *      the Simulation Driver.
 *
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class IVoteService {

    public void submitAnswers(String id, String str, Question question){
        question.submit(id, str);
    }
    public Question newQuestion(String query, String ans1, String ans2){
        Question question = new SingleChoice(query,ans1,ans2);
        return question;
    }

    public Question newQuestion(String query, String answers[]){
        Question question = new MultipleChoice(query, answers);
        return question;
    }

    // Shows the life data for single choice.

    public void showLiveData(Question question){
        HashMap submittedAns = question.submittedAnswers();
        Set <String> studentIDs = question.submittedAnswers().keySet();
        System.out.println();
        for (String students:studentIDs) {
            System.out.printf("Student %s answered : %s\n", students, submittedAns.get(students));
        }
    }

    // Shows the live data for multiple choice.

    public void showLiveDateMul(Question question){
        HashMap submittedAns = question.submittedAnswers();
        Set <String> studentIDs = question.submittedAnswers().keySet();
        System.out.println();
        for (String students:studentIDs) {
            Object val = submittedAns.get(students);
            String output []= (String[])val;
            System.out.printf("Student %s answered : %s\n", students, Arrays.toString(output));
        }
    }

    // Prints the results onto the overall answers.

    public void showResults (Question question){
        Set <String> answers = question.answerPool().keySet();
        System.out.println();
        for (String ans: answers) {
            System.out.printf("The number submitted for %s is: %d\n", ans,question.answerPool().get(ans));
        }
    }
}