package streams;

import java.util.stream.IntStream;

public class ReverseIntArray {
   public static void main(String[] args) {
    		int[] array= {10,20,30,40,50,60};
		int[] revArray=IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();
		for(int i=0;i<revArray.length;i++) {
			System.out.print(revArray[i]+" ");
		}
		System.out.println();
	}
   } 

