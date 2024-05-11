package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String string="Hello World";
		String revString=Arrays.stream(string.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("Reverse String :"+revString);
    }
}
