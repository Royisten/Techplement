# Quiz Generator Application

This is a simple Quiz Generator application built using Java, where users can create quizzes with multiple questions and options, then take the quiz to check their score.

## Features
- Create a quiz by specifying the topic, questions, and answers.
- Take an existing quiz and answer the questions.
- Provides feedback on the score after completing the quiz.

## How to Run the Application

### 1. Running via Main Method
To run the application, simply execute the `Main.java` class.

#### Steps:
1. Open the project folder in your IDE (such as IntelliJ IDEA, Eclipse, or VS Code).
2. Locate the `Main.java` file under the `QuizGenerator` package.
3. Run the `Main.java` file.
4. Once the program is running, you'll see the following menu in the terminal:

    ```plaintext
    Quiz Generator Menu:
    1. Create Quiz
    2. Take a Quiz
    3. EXIT THE APPLICATION
    ENTER YOUR CHOICE:
    ```

    You can enter a number to select one of the options:

    - **1**: Create a new quiz by providing a quiz topic, questions, options, and the correct answer.
    - **2**: Take an existing quiz, select a quiz from the available list, and answer the questions.
    - **3**: Exit the application.

### 2. Running via Terminal
To run the application from the terminal:

1. **Navigate to the Project Directory**:
   Open a terminal and navigate to the root of your project.

2. **Compile the Java Files**:
   Run the following command to compile all the Java files:
   ```bash
   javac WEEK_1_TASK/QuizGenerator/*.java
