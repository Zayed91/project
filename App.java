
//write an import statement to include the Scanner class

import java.util.Scanner;
//write an import statement to include the Random class
import java.util.Random;



/*
 * Students Name: Zayed Mansour AL-matrafi
 * IDs:446002306
 * Group: 30
 */

/*
 * Program Class Defintion
 */
public class App {

    // declare a constant named "PROGRAM" of type String and give it the value:
    // "Simple Operations Program"
    static String PROGRAM = "Simple Operations Program";


    /*** generateIncrementalOutput() method ***/
    /*
     * This method accepts two integer parameters: 'start' and 'end'. Return nothing. 
     * It validates if 'start' is smaller than 'end'. 
     * If not, it prints an error message and returns without generating any output.
     * If the validation passes, it proceeds to generate the incremental output 
     * starting from 'start' and incrementing by 5 until it reaches or surpasses 'end'. 
     * For example, if start=10,end=30, the output is 10 15 20 25 30 
     * 
     * Example of Invalid values, if start=50,end=30 , the output 
        "Error: The first integer must be smaller than the second integer".
    */

    /**
     * generateIncrementalOutput Method code should be below this comment
     **/

    // this  method if the start is greater than end, then it will print an error and stop. If not it will continue normally
    public static void generateIncrementalOutput(int start, int end) {
        if (start > end) {
            System.out.println("Error: The first integer must be smaller than the second integer...");
            // the return is one who will end the method if its invalid
            return;

        }// here is for loop... if start = 5 and end = 30 the start will increase +5 until it reaches the end

        for (int i = start; i <= end; i += 5) {
            // to create space between the numbers
            System.out.print(i + " ");

        }// just to create a space so the output will be in new line

        System.out.println();

    }


    /***************End of generateIncrementalOutput Method*****************/


    //write a static method named "guessingNumber" that 
    //takes one integer number as a parameter between the range of 1 to 100
    //and returns true if the number matches a random number and displays "Congratulations!"
    //else method returns false if the number is less than the random number and displays "Too low!"
    //otherwise the method reutrns false if the number is greater than the random number and displays "Too high!"

    //For example: if the number equals 25 and the random number is 90
    //the return value should be false
    //and the output is: Too low!

    /**
     * Hint:
     * Use Random class methods of the `rng` variable defined below
     * For example, to get a random integer number between 0 and 10, and store it in a variable `r`,
     * you can use the following statement:
     * int r = rng.nextInt(11);
     * <p>
     * Note 01: the Random object/variable has beed defined for you, so you only need to use it inside the method's body
     * its called "rng"
     * Note 02: use if else to compare numbers
     */

    Random rng = new Random();
    /**guessingNumber Method code should be below this comment**/


    /***************End of guessingNumber Method*****************/

    /*
     * main()
     *
     * Program execution begins with this method.
     */
    public static void main(String[] args) {


        // write a print statment to display the value of the constant "PROGRAM"
        System.out.println(PROGRAM);
        // declare a Scanner's Object to read user's inputs
        Scanner scanner = new Scanner(System.in);

        // declare two variables named 'start' and 'end' of type integer.
        int start, end;
        // Prompt the user to enter two numbers, and clearly tell them: 
        //"Please ensure that the second number is larger than the first number."
        System.out.print("Please enter the two numbers, Please ensure that the second number is larger than the first number: ");
        start = scanner.nextInt();
        end = scanner.nextInt();

        //declare a integer variable named 'number' . Then prompt user to enter the value. 


        /**** Once You Are Done Coding, Un-Comment the following code lines ****/
        /**** That means remove only // ****/

        generateIncrementalOutput(start, end);

        //guessingNumber(number);


    }
}
