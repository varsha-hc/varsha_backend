package streams;

import java.util.Arrays;
import java.util.List;

public class StringNumb {
    public static void main(String[] args) {
        List<String> strlist=Arrays.asList("1css","2java","3react");
		strlist.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::print);
		System.out.println();
    }
}
