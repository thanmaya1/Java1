package gh;

import java.util.Scanner;

public class Method {
	//Input: a string -Password,output the last digit of the password plus 2
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the password: ");
    String passWord = scanner.nextLine();
    int numlast = Character.getNumericValue(passWord.charAt(7)); 
    System.out.println(numlast+2);
  }
}
