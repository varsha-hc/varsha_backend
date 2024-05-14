package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortNumb {
    public static void main(String[] args) {
                List<Integer> list = Arrays.asList(9,8,7,6,5,4,3,2,1);
       List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
       System.out.println(sortedList);
    }
    
}
