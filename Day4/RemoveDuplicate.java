package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> strlist=Arrays.asList("Physics","Maths","ComputerScience","Maths","Kannada","English");
		List<String> removeStr=strlist.stream().distinct().collect(Collectors.toList());
		System.out.println(removeStr);
    }
}
