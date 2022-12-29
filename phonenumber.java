package gh;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the mobile number: ");
    String mobileNumber = scanner.nextLine();

    // Extract the first two digits and the last two digits
    String firstTwo = mobileNumber.substring(0, 2);
    String lastTwo = mobileNumber.substring(mobileNumber.length() - 2);

    // Convert the strings to integers and calculate the sum
    int sumFirstTwo = Character.getNumericValue(firstTwo.charAt(0)) + Character.getNumericValue(firstTwo.charAt(1));
    int sumLastTwo = Character.getNumericValue(lastTwo.charAt(0)) + Character.getNumericValue(lastTwo.charAt(1));

    // Combine the sums into a single digit
    int combinedSum = sumFirstTwo*10+ sumLastTwo;
    

    // Print the result
    System.out.println("Combined sum: " + combinedSum);
  }
}
