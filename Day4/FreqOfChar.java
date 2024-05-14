package streams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfChar {
    public static void main(String[] args) {
        
		String str="Hello World";
		System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println();
    }
    
}
