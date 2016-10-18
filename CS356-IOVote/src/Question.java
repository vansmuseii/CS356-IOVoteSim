/**
 *      File: Question.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to hold the questions and answers.
 *
 */

import java.util.HashMap;

public interface Question {
    public void submit(String studentID, String ans);
    public HashMap submittedAnswers();
    public HashMap answerPool();
}

