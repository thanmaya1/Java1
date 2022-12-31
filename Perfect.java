
public class Perfect {
	public static void main(String [] args) {
		int i,sum=0;
		int n=55;
		for(i=1;i<n;i++) {
			 if(n%i==0)
					sum=sum+i;
			}
		if(sum==n)
			System.out.println(true);
		else
			System.out.println(false);
		}
}
