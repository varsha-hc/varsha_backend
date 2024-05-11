package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;


public class DuplicateNumb {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,2,5,6,8,1);
Set<Integer>  dup= list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
System.out.println(dup);
    }
    
}
