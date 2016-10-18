/**
 *      File: Question.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to hold the questions and answers of data.
 *
 */

public interface Question{

    void submit(String studentID, String ans);
    DataStorage getDataStore();
}

