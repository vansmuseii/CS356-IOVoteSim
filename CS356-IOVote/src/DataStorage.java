/**
 *      File: DataStorage.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assignment 1
 *      Date Last Modified: 10/18/2016
 *
 *      Purpose: This file is supposed to control the data coming in and out.
 *
 */


import java.util.HashMap;

public class DataStorage {
    private HashMap submitted, pool;

    public DataStorage() {
        submitted = new HashMap();
        pool = new HashMap();
    }

    public void setSubmitted(HashMap x){
        submitted = x;
    }

    public void setPool(HashMap x){
        pool = x;
    }

    public HashMap submittedAnswers(){
        return submitted;
    }
    public HashMap answerPool(){
        return pool;
    }
}
