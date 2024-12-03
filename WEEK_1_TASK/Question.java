package WEEK_1_TASK;

import java.io.Serializable;

public class Question implements Serializable {
    private String questionText; // the question asked
    private String[] options; // multiple options displayed /1-4
    private int correctOption; // 1-4

}
/*
 * this class creates a single set of a question (plain text) ,
 * it options
 * (4 options with a right answer)
 * and a the correct anwser no# (like if the correct anwser is option 2 the
 * correctoption = 2)
 * 
 */