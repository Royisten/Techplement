package WEEK_1_TASK.QuizGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz implements Serializable {
    
    private String QuizTopicName;  
    private ArrayList<Question> questionsHolder; //list of questions in a array

   
    //? Constructor to intialise the quiz 
    //? Along with set of questions it holds 
    //? Whenever a instance of "Quiz.java" is called then
    //? all the above "mentioned" will also be called

    public Quiz(String QuizTopicName){
        this.QuizTopicName=QuizTopicName;
        this.questionsHolder=new ArrayList<>();
    }

    //? adds a question to the quiz
    //? (each intances of "Question.java" is added to the arraylist<> questions)
    public void addQuestion(Question question){
        questionsHolder.add(question);
    }
        
    //? starts the quiz , asks question , 
    //? and returns score for feedback.

    public void takeQuiz(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\n STARTING QUIZ : " + QuizTopicName);
        System.out.println("-----------------------");

        for (Question question : questionsHolder){
                question.displayQuestion(); //shows the pre-created questions
                System.out.println("Your answer (1-4): ");
                int userAnswer=scanner.nextInt();

                if (question.isCorrect(userAnswer)) {
                    System.out.println("Correct ! \n");
                    score++;
                }else{
                    System.out.println("InCorrect ! \n");
                }
                
                System.out.println("Quiz complete ! Your Score : " +score+"/"+questionsHolder.size());

        } 
    }
      //shows the name of the quiz at the end
      public String getName() {
        return QuizTopicName;
    }
}
