package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStrinIncOrder {
    public static void main(String[] args) {
        	List<String> strlist=Arrays.asList("Dharathi","Varsha","Sneha","Divya","Rishikha");
		strlist.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
    }

