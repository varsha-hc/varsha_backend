package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainMax3Numb {
   public static void main(String[] args) {
    	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Max number");
		list.stream().sorted().limit(3).forEach(System.out::print);
		System.out.println();
		System.out.println("Min number");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
		System.out.println();
	}
   } 

