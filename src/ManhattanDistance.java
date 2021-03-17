import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

/**
 * @author MD Bakhtiar R Akhib
 * This class takes user input for the x and y coordinates of both
 * the points and calculates the manhattan distance between the points
 */
public class ManhattanDistance {
    /**
     * This is the main method that takes the user inputs for the points and calls other methods
     * @param args
     */
    public static void main(String[] args) {
        int x1, y1, x2, y2;

        /*Takes user input for the x-coordinate of the point A and sends it to to the validateInput method to verify input is an integer*/
        System.out.print("Enter the integer value for the x-coordinate of the point A: ");
        Scanner X1input = new Scanner(System.in);
        x1 = validateInput(X1input);

        /*Takes user input for the y-coordinate of the point A and sends it to to the validateInput method to verify input is an integer*/
        System.out.print("\nEnter the integer value for the y-coordinate of the point A: ");
        Scanner Y1input = new Scanner(System.in);
        y1 = validateInput(Y1input);

        /*Takes user input for the x-coordinate of the point B and sends it to to the validateInput method to verify input is an integer*/
        System.out.print("\nEnter the integer value for the x-coordinate of the point B: ");
        Scanner X2input = new Scanner(System.in);
        x2 = validateInput(X2input);

        /*Takes user input for the x-coordinate of the point B and sends it to to the validateInput method to verify input is an integer*/
        System.out.print("\nEnter the integer value for the y-coordinate of the point B: ");
        Scanner Y2input = new Scanner(System.in);
        y2 = validateInput(Y2input);

        /*Prints out the calculated manhattan distance returned from the calcDistance method*/
        System.out.println("\nThe manhattan distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") = " + calcDistance(x1, y1, x2, y2));
    }

    /**
     * This method calculates the total manhattan distance using the formula (|x1-x2| + |y1-y2|)
     * and returns the calculates distance
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return int
     */
    private static int calcDistance(int x1, int y1, int x2, int y2) {
        int distanceX, distanceY;
        distanceX = Math.abs(x1 - x2);
        distanceY = Math.abs(y1-y2);
        return (distanceX + distanceY);
    }

    /**
     * This method takes in the userinput and catches the error if the other user doesn't input
     * a valid integer input and prompts the user to input again
     * @param input
     * @return int
     */
    private static int validateInput(Scanner input){
        int value;
        try{
            value = input.nextInt();
        }
        catch(InputMismatchException e){
            /* Loops until the user inputs a valid integer and returns the value*/
            while(!input.hasNextInt()){
                System.out.print("Invalid input \nPlease enter a valid integer: ");
                input = new Scanner(System.in);
            }
            value = input.nextInt();
        }
        return value;
    }
}
