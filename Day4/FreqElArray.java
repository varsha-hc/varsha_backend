package streams;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Function;

public class FreqElArray {
    public static void main(String[] args) {
        String[] strArr= {"Dog","Cow","Cat","Dog","Elephant","Camel","Lion","Peacoak"};
		System.out.println(Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
    }

