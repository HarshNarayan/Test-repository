
public class FrequencyOfOccurenceOfElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 3, 2, 5, 7, 9, 1, 8, 9 };
		int[] fr = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < fr.length; j++) {
				if (arr[i] == fr[j]) {
					count++;
					fr[j] = visited;
				}
			}if (fr[i]!=visited) {
			fr[i]=count;				
			}
			
		}
	}

}
