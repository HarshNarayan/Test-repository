public class Primenumber {

	 public static void main(String[] args) {
		for (int i = 2; i<=10; i++) {
			boolean B = Checkprimenumber(i);
			if(B) {
				System.out.println(i+" ");
			}
		}	
	}
	public static boolean Checkprimenumber(int number){
	
		int i = 0;
		if (number == 0 || number == 1) {
			System.out.println("number is not prime");
		} else {
			for (i = 2; i <= number/2; i++) {
				int remainder = number % i ;
				if (remainder==0) {
					return false;
				}
			}
		}
		return true;
	}
}
