package streams;

import java.util.Arrays;
import java.util.List;

public class CommonElement {
   public static void main(String[] args) {
    List<Integer> list1=Arrays.asList(2,1,3,6,2);
		List<Integer> list2=Arrays.asList(1,5,6,7,9);
		list1.stream().filter(list2::contains).forEach(System.out::print);
		System.out.println();
   } 
}
