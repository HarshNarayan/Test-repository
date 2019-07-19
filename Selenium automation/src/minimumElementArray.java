
public class minimumElementArray {
	

	public static void main(String[] args) {
		int[] a= new int[] {34,23,12,5,67,1};
		int min=a[0];
		int b = a.length;
		
		for(int i=0;i<b;i++) {
			if (min>a[i]) {
				min=a[i];
			} 
			
			}System.out.println(min);
		
	}

}
