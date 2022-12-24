public class findFactors {
	  public static void findaFactors(int num) {
	    for (int i = 1; i <= num; i++) {
	      if (num % i == 0) {
	        System.out.println(i);
	      }
	    }
	  }

	  public static void main(String[] args) {
	    int num = 12;
	    System.out.println("The factors of " + num + " are:");
	    findaFactors(num);
	  }
	}
  public class PrimeChecker {
	  public static boolean isPrime(int num) {
	    if (num < 2) {
	      return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	      if (num % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }

	  public static void main(String[] args) {
	    int num = 7;
	    boolean isPrime = isPrime(num);
	    System.out.println("Is " + num + " a prime number? " + isPrime);
	  }
	}
  public class PalindromeChecker {
	  public static boolean isPalindrome(int num) {
	    int originalNum = num;
	    int reversedNum = 0;
	    while (num > 0) {
	      reversedNum = reversedNum * 10 + num % 10;
	      num /= 10;
	    }
	    return originalNum == reversedNum;
	  }

	  public static void main(String[] args) {
	    int num = 1215;
	    boolean isPalindrome = isPalindrome(num);
	    System.out.println("Is " + num + " a palindrome? " + isPalindrome);
	  }
	}
  public class Sum {
	public static int addition(int num) {
	    if (num == 1) {
	      return 1;
	    }
	    return num + addition(num - 1);
	  }
	 public static void main(String[] args) {
		 Sum f2 = new Sum();
		 int solution = f2.addition(5);
		 System.out.println("The sum of the integers from 1 to 5 is: " + solution);

		  }
}
public class Factorial {
	  public static int calculateFactorial(int num) {
	    if (num == 1) {
	      return 1;
	    }
	    return num * calculateFactorial(num - 1);
	  }

	  public static void main(String[] args) {
	    Factorial f1 = new Factorial();
	    int factorial = f1.calculateFactorial(5);
	    System.out.println("The factorial of 5 is: " + factorial);
	  }
	}
  public class Calculators {
	public static int add(int a, int b) {
	    return a + b;
	  }

	  public static int subtract(int a, int b) {
	    return a - b;
	  }

	  public static void main(String[] args) {
	    int result1 = add(10, 20);
	    int result2 = subtract(30, 15);

	    System.out.println("The sum of 10 and 20 is: " + result1);
	    System.out.println("The difference between 30 and 15 is: " + result2);
	  }

}
public class App {
  public static void main(String [] args) {
	 System.out.println("Hello World"); 
  }
  
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20,c;
c=a+b;
System.out.println("c"+c);
	}

}
