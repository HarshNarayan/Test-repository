
public class CopyElementFromOneArrayToOther {
	
	public static void main(String[] args) {
		int[] arr1=new int [] {23,24,56,43,21};
		int[] arr2= new int [arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("second array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
			
		}
	}

}
