
public class Check {

	public static void main(String[] args) {
		int n=157;
		int temp=n;
		int c=0;
		while(n>0) {
			int a=n%10;
			n=n/10;
			c=c+(a*a*a);		
		}
		if (temp==c) {
			System.out.println("Number is amstrong");
			
		}else {
			System.out.println("number is not the amstrong");
		}
		

	}

}
