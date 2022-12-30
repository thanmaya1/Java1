package gh;
import java.util.Scanner;

public class Power {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//create a Scanner object
		//prompt
		System.out.print("Enter the base number:");
		int base = scanner.nextInt();//read
		System.out.print("Enter the exponent:");
		int exponent = scanner.nextInt();//read
		int result = 1;
		int counter=0;
		while(counter<exponent){
			 result = result * base;//while loop
		      counter++;
		}
		System.out.println("Result:"+result);//print result
		scanner.close();
		
		
		
	}

}
