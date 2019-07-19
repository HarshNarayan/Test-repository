
public class How_to_del_aelement_array {
	public static void main(String[] args) {
		int a[] = new int[] { 10, 20, 34, 56, 78, 98 };
		int del_element = 20;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (del_element == a[i]) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];

				}
				count = count + 1;
				break;

			}
		}
		if (count == 0) {
			System.out.println("element not found");

		} else {
			System.out.println("element del succesfully");
			for (int i = 0; i < a.length - 1; i++) {
				System.out.println(a[i]);

			}

		}

	}

}
