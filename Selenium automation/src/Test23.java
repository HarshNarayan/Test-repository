
public class Test23 {

	public static void main(String[] args) {
		 int n =121;
		 int temp=121;
		 int sum = 0 ;
		while (n>0) {
			int r = n%10;
			sum = (sum*10)+r;
			n=n/10;	
		}if (temp == sum) {
			System.out.println("Number is palindrome");
			
		}else {
			System.out.println("Not palindrome");
		}
		 
		   
		
		}
		
	}


