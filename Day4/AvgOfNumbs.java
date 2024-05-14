package streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbs {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,33,44,22,12,34);

        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("avg is:" +avg);
    }
}
