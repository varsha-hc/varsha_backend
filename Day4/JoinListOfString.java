package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfString {
    public static void main(String[] args) {
        	List<String> strlist=Arrays.asList("Ramya","Bhoomi","Sneha","Priya");
		String str=strlist.stream().collect(Collectors.joining("Delimiter","Prefix","Suffix"));
		System.out.println(str);
    }
}
