
public class Bubblesort {

	static void Bubblesort(int[] arr) {

		int a = arr.length;
		int temp = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 1; j < (a - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 29, 21, 33, 1, 9 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		Bubblesort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
	}
}
