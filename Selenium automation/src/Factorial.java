
public class Factorial {

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		int n = 4;
		int Factorial;
		Factorial = factorial(n);
		System.out.println(Factorial);
	}

}