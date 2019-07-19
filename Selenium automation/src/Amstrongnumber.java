import java.util.Scanner;

public class Amstrongnumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int c = 0,temp,r=0;
		sc = new Scanner(System.in);
		System.out.println("Enter the number"+":"+" ");
		int number=sc.nextInt();
		temp=number;
		while (number>0) {
			r=number%10;
			c=c+(r*r*r);
			number=number/10;
		}
		if (temp==c) {
			System.out.println("Armstrong number"+" "+c);
		} else {
			System.out.println("Not armstrong number");      
		}
		
	}
	
}
