
public class Electricity {
public static void main(String [] args) {
	int unit= 300;
	int flag;
	int extra=0;
	
	if(unit<50)
		flag=2;
	else if(unit<=100)
		flag=3;
	else if(unit<=300) {
		flag=5;
	    extra=100;
	}
	else if(unit<=450) {
		flag=6;
	    extra=200;
	}
		
	else  {
		flag=8;
	    extra=250;
	}
		
	
	int total=unit*flag+extra;
	System.out.println(total);
	
	
	
	
	
	
}
}
