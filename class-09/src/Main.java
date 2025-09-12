/*
    🔹 CONTROL STATEMENTS IN JAVA
    -----------------------------
    These are used to make decisions in a program
    and control the flow of execution.
*/

public class Main {
    public static void main(String[] args) {

        /*
            1️⃣ IF Statement
            ----------------
            Syntax:
                if(condition) {
                    // executes only if condition is true
                }

            - Works ONLY with boolean values.
            - Does nothing if condition is false.
        */
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote."); // executes because condition is true
        }
        System.out.println("End of IF example\n");

        /*
            2️⃣ IF - ELSE Statement
            -----------------------
            Syntax:
                if(condition) {
                    // if condition is true → executes this block
                } else {
                    // if condition is false → executes this block
                }

            - else cannot exist without if.
            - else does NOT have its own condition.
        */
        int marks = 45;
        if (marks >= 50) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }
        System.out.println("End of IF-ELSE example\n");

        /*
            3️⃣ IF - ELSE IF Ladder
            ------------------------
            Syntax:
                if(condition1) {
                    // executes if condition1 is true
                } else if(condition2) {
                    // executes if condition2 is true
                } else if(condition3) {
                    // executes if condition3 is true
                } else {
                    // executes when none of the above are true
                }

            - This is just a chain of if-else statements.
        */
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A+");
        } else if (score >= 75) {
            System.out.println("Grade: A");
        } else if (score >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        System.out.println("End of IF-ELSE IF example\n");

        /*
            4️⃣ IF Ladder (Nested IFs)
            --------------------------
            - Multiple if statements inside one another.
            - Each condition is checked separately.

            Example:
        */
        int number = 25;

        if (number > 0) {
            System.out.println("Number is positive");

            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

            if (number > 20) {
                System.out.println("Number is greater than 20");
            }
        }
        System.out.println("End of IF Ladder example\n");
    }
}

/*
    📌 SUMMARY:
    ----------
    - if → Runs only when condition is true.
    - if-else → Chooses between two blocks.
    - if-else-if ladder → Checks multiple conditions.
    - Nested if → Multiple ifs inside one another.

    ✅ Condition must ALWAYS evaluate to a boolean value.
*/
