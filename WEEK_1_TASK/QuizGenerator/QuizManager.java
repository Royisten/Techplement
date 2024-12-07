package WEEK_1_TASK.QuizGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {
    private ArrayList<Quiz> quizHolder; // ? holds the Quizes that has been created

    // Constructor to Intialise the quiz manager
    public QuizManager() {
        this.quizHolder = new ArrayList<>();
    }

    // ! creating quiz (method)
    public void createQuiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name of the Quiz Topic");
        String topicName = scanner.nextLine();

        Quiz quiz = new Quiz(topicName);
        System.out.println("Quiz '" + topicName + "' created! ");

        // ! adding questions to the quiz
        while (true) {
            System.out.println("Enter the question to be displayed! (Type \"DONE\" after you finish typing) : ");
            String questionText = scanner.nextLine();
            if (questionText.equalsIgnoreCase("DONE")) {
                break;
            }
            // ! adding the options
            String[] options = new String[4];
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter the Option " + (i+1) + " : ");
                options[i] = scanner.nextLine();
            }
            //! adding the correct option
            System.out.println("Enter the correct option no \'1-4\' : ");
            int correctOption= scanner.nextInt();
            scanner.nextLine();

            //! added the question to the quiz
            quiz.addQuestion(new Question(questionText, options, correctOption));
            System.out.println("Question added! \n");
        }
        quizHolder.add(quiz); //! added the quiz to the quizManager(list) 
    }

    //? allows the user to take quiz if already created
    
    public void takeQuiz(){
        if (quizHolder.isEmpty()) {
            System.out.println("No Quiz available!, Please Create a quiz first.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Avaialable Quizzes : ");
        for (int i = 0; i < quizHolder.size(); i++) {
            System.out.println((i+1)+". "+ quizHolder.get(i).getName());
        }
        System.out.println("Select a Quiz by No : ");
        int quizChoice = scanner.nextInt();

        if (quizChoice<1 || quizChoice>quizHolder.size()) {
            System.out.println("Invalid choice !!");
        } else {
            quizHolder.get(quizChoice-1).takeQuiz();
        }
    }
}
