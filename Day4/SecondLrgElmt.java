package streams;

import java.util.stream.IntStream;

public class SecondLrgElmt {
    public static void main(String[] args) {
        	int[] arr= {1,2,3,4,5,6};
		int secondElement=IntStream.of(arr).sorted().skip(arr.length-2).findFirst().getAsInt();
		System.out.println(secondElement);
    }
}
