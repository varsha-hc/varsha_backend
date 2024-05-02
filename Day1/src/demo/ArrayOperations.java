package demo;
import java.util.Scanner;

public class ArrayOperations {
	static int[] arr;
	static int[] newarr;
	
	public static int[] createArray() {
		System.out.println("Enter the array size :");
		Scanner scanner=new Scanner(System.in);
		int size = scanner.nextInt();
		 
		int arr[]=new int[size];
		System.out.println("Enter the element:");
		for ( int i =0; i< arr.length; i++) {
			arr[i]=scanner.nextInt();
	
		}
	scanner.close();
	System.out.println("Array");
	return arr;

	}

//public static int[] printArray(){
//	for ( int i=0; i< arr.length; i++){
//	System.out.println(arr[i]);
//	}
//scanner.close();
//System.out.println("Array printed");
//return arr;
//	}
	
	
//	/public static int[] reverseArray(int[] arr){
//    System.ouy.println("Reverse Array")
//		for ( int i=0; i< arr.length; i++){
//		System.out.println(arr[i]);
//		}
	//scanner.close();
	//System.out.println("Array printed");
	//return arr;
	//	
//}

	public static void main(String[] args) {
		
	}
}

