package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinList {
    public static void main(String[] args) {
        	List<Integer> list=Arrays.asList(1,6,3,23,66,99,3);
		System.out.println("Maximum element is: "+ list.stream().max(Comparator.naturalOrder()).get());
		System.out.println("Minimum element is: "+ list.stream().min(Comparator.naturalOrder()).get());
    }
}
