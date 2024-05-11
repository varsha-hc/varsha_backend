package streams;

import java.util.stream.IntStream;

public class SumOfNatural {
    public static void main(String[] args) {
        	int sum=IntStream.range(10, 20).sum();
		System.out.println("sum first 10 natural numbers :"+sum);
    }
}
