package gh;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // create a Scanner object

	    // prompt the user to enter a number
	    System.out.print("Enter a number: ");
	    int num = scanner.nextInt(); // read the number from the user

	    int factorial = 1; // factorial
	    int counter = 1; // counter

	    // while loop
	    while (counter <= num) {
	      factorial = factorial * counter;
	      counter++;
	    }

	    System.out.println("Factorial: " + factorial); // print the factorial
	}

}
