package streams;
import java.util.Arrays;
import java.util.stream.IntStream;


public class MergeTwoArray {
  public static void main(String[] args) {
    	
		int[] array1= {1,2,3,4,5};
		int[] array2= {6,7,8,9,10};
		int[] sortedArray=IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+" ");
		}
		System.out.println();

	}
  }  
