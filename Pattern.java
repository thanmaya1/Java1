package gh;

public class Pattern {
	  public static void main(String[] args) {
	    for (int i = 5; i >= 1; i--) {
	      System.out.printf("%" + (5 - i + 1) + "s", ""); // print spaces
	      for (int j = 1; j <= i; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	}
