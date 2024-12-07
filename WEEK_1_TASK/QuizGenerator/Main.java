package WEEK_1_TASK.QuizGenerator;

import java.util.Scanner;

//!program runner
public class Main {
    public static void main(String[] args) {
        QuizManager quizManager = new QuizManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Quiz Generator Menu : ");
            System.out.println("1. Create Quiz");
            System.out.println("2. Take a Quiz");
            System.out.println("3. EXIT THE APPLICATION");
            System.out.println("ENETR YOUR CHOICE : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    quizManager.createQuiz();
                    break;
                case 2:
                    quizManager.takeQuiz();
                    break;
                case 3:
                System.out.println("Exiting Quiz Generator. Goodbye :)");    
                scanner.close(); // Close the Scanner to release resources
                return; // Exit the `main` method, which stops the program
                default:
                    System.out.println("Invalid choice . Please try again.");
            }
        }
    }
}
