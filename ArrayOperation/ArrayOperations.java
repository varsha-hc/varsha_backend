package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	static int[] arr;
	static int[] newArr;
	static int[] array;

	public static int[] createArray() {
		System.out.println("Enter the array size :");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}

		System.out.println("Array created");
		return arr;
	}

	public static void reverseArray() {

		int array1[] = { 1, 2, 3, 4, 5, 6 };
		int temp;
		int j = 0;
		int array2[] = new int[array1.length];
		for (int i = array1.length - 1; i >= 0; i--) {
			temp = array1[i];
			array1[i] = array2[j];
			array2[j] = temp;
			j++;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

	public static void mergeArray() {
		int ci = 0;
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7 };
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[ci] = a[i];
			ci++;
		}
		for (int i = 0; i < b.length; i++) {
			c[ci] = b[i];
			ci++;

		}
		System.out.println(Arrays.toString(c));
	}

	public static int[] minmaxArray() {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int min = a[0];
		int max = a[5];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("max value" + max);
		System.out.println("min value" + min);
		return arr;

	}

	public static int[] primeArray() {

		int n = 13;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
		return arr;

	}

	public static void duplicateArray() {
		
		int[] arr = new int[] {6,1,7,1,6,9,4};
		System.out.println("Duplicate Elements in given array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					  System.out.println(arr[j]);
				}
			}
		}
	}

	public static int[] zigzagmergeArray(int[] arr1, int[] arr2) {

//    	 [1, 2, 3, 4]   [4, 5, 6, 7, 8]

		int[] arr=new int[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			arr[k++] = arr1[i++];
			arr[k++] = arr2[j++];
		}
		while(i < arr1.length) {
			arr[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			arr[k++] = arr2[j++];
		}
		return arr;

	}
	
	public static void sortArray() {
		
		int[] arr = new int[] {4,6,2,9,1};
		Arrays.sort(arr);
		System.out.println("Sorted Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	     
	
	public static int[] unionArray(int arr1[], int arr2[]) {
		
		int count=0;		
		int[] arr3 = unionArray(arr1, arr2);
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr2[j]=-1;
					count++;
				}
			}
		}
		System.out.println(count);
		return arr3;
	}
	public static void intersectionArray() {
		
		int arr[]= {2,6,4,1};
		int arr2[]= {1,9,5,6};
		System.out.println("Intersection of Two arrays:");
		
		for(int i=0;i<arr.length;i++) {
			
			for( int j=0;j<arr2.length;j++) {
				
				if(arr[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}	     
	}
		   public static void removeDuplicate() {
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the size of an array:");
					int size = sc.nextInt();
					
					int[] arr = new int[size];
					System.out.println("Enter the Elements:");
					
					  for(int i=0;i<size;i++) {
						  
					 arr[i]=sc.nextInt();
					  }
					  int temp[]= new int[size];
					  int j=0;
					  Arrays.sort(arr);
					  
					  for(int i=0;i<size-1;i++ )
					  {
						  if(arr[i]!=arr[i+1])
							  temp[j++]=arr[i];
					  }
					  
					  temp[j++]=arr[size-1];
					  for(int k=0;k<j;k++)
					  {
						  System.out.println(temp[k]);
				}
					  		
	}

		
			public static void duplicateElements() {
				
				int[] arr = new int[] {1,2,3,4,2,7,8,8,3};
				System.out.println("Duplicate Elements in given array:");
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]==arr[j]) {
							  System.out.println(arr[j]);
						}
					}
				}
			}
			public static void countOccurance() {
				int arr[]= {2,4,6,8,3,5,7,9,1};
				countOccurance();
			}
			static void countAccurance(int arr[]) {
				Array.sort(arr);
				for (int i=0; i<=arr.length; i++) {
					
					int count=1;
					if(i!=arr.length-1) {
					for(int j=i+1; i<arr.length; j++) {
						if(arr[i]==arr[j])
							count++;
						   else
							break;
					}
					
	System.out.println(arr[i]+ "--> "+count);
			i+=(count-1);
					}
					
				}
			}
			
		
	public static void main(String[] args) {
//	int[] arr = createArray();
//	int[] array= printArray();
//	reverseArray();
//		mergeArray();
//	minmaxArray();
//	primeArray();
//		duplicateArray();
//		sortArray();
//		unionArray(arr,arr);
//		removeDuplicate();
//		int[] arr1 = createArray();
//		int[] arr2 = createArray();
//		int[] res = zigzagmergeArray(arr1, arr2);
		
//		for(int i : res) {
//			System.out.print(i + " ");
//		intersectionArray();
		countAccurance(arr);
		}
	}

