
public class Replace_a_element_in_arr {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,34,12,45};
		int pos=3;
		int element=100;
		for (int i=a.length-1;i>pos-1;i--) {
			a[i]=a[i-1];
			}
		a[pos-1]=element;
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		}

	}

}
