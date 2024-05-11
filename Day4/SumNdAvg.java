package streams;

import java.util.Arrays;

public class SumNdAvg {
  public static void main(String[] args) {
    	int[] array= {1,2,3,4,5,6};
		int sum=Arrays.stream(array).sum();
		System.out.println("Sum of Element is: "+sum);
		double avg=Arrays.stream(array).average().getAsDouble();
		System.out.println("Avg of Element is: "+avg);
  }  
}
