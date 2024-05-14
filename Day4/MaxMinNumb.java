package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MaxMinNumb {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,7,16,22,55,99,100,1);

        int max = list.stream().max(Comparator.comparing(Integer :: valueOf)).get();
        System.out.println(max);

        int min = list.stream().min(Comparator.comparing(Integer :: valueOf)).get();
         System.out.println(min);
    }
}
