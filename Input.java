package gh;

import java.util.Scanner;

public class Input {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter your name: ");
		    String name = scanner.nextLine();
		    System.out.println(name);
		    int i,n;
		    n=name.length();
		    for(i=0;i<n;i++) {
		    	if(charAt(i)==charAt(n-i));
		    }
		    
		    }
}
