/**
 *      File: Student.java
 *      Author: Van Steven Muse II
 *      Class: CS 356 - Object Oriented Programming and Design
 *
 *      Assignment: Assigment 1
 *      Date Last Modified: 10/14/2016
 *
 *      Purpose: This file is supposed to hold the information of the student
 *              for the IVote service.
 *
 */

import java.util.Random;

public class Student {

    private String studentID;

    public Student (){
        Random r = new Random();
        studentID = Integer.toString(r.nextInt(Integer.MAX_VALUE));
    }

}