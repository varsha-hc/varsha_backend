package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigit {
    public static void main(String[] args) {
        int number=325678431;
		long sum=Stream.of(String.valueOf(number).split("")).collect(Collectors.summarizingInt(Integer::parseInt)).getSum();
		System.out.println("Sum of digits: "+sum);
    }
}
