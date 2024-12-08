# Quiz Generator Application

This is a simple Quiz Generator application built using Java, where users can create quizzes with multiple questions and options, then take the quiz to check their score.

## Features
- Create a quiz by specifying the topic, questions, and answers.
- Take an existing quiz and answer the questions.
- Provides feedback on the score after completing the quiz.


## How to Access the Project

To access this project, you can choose any of the methods below:

### **1. Clone the Repository**
1. Open a terminal and use the following command to clone the repository:
   ```bash
   git clone <https://github.com/Royisten/Techplement>

2. Open the cloned project folder in your IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code). 

3. Follow the "How to Run the Application" section below.  

### **2. Download as ZIP**
1. Navigate to the repository's page and click on the `Download ZIP` button.
 
2. Extract the downloaded ZIP file to a folder on your computer.
 
3. Open the extracted folder in your preferred IDE.
 
4. Follow the "How to Run the Application" section below.
 
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

    - **1**: Create a new quiz by providing a quiz topic, questions, options, and the correct answer.(type `DONE` to finish writing a question and also it's options)
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

## FAQ   

### Q: How do I add a new quiz?
 - Run the program and select `Option 1` from the menu. You will be prompted to enter the quiz topic, questions, options, and correct answers.
 
### Q: How do I exit the program?
 - Select `Option 3` from the menu. The program will terminate and display a goodbye message.

## Additional Notes

- Ensure you have the `Java Development Kit (JDK)` installed on your system to compile and run the application.

- Verify that the folder structure matches the package declarations in the code `WEEK_1_TASK.QuizGenerator`.

- If you encounter any issues, recheck your environment setup or ensure all files were imported correctly.

