package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElArray {
    public static void main(String[] args) {
        	HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> list=Arrays.asList(1,2,3,4,1,2,5,6,5,7,8);
		list.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
		System.out.println(set);
    }
}
