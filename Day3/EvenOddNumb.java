package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumb {
    public static void main(String[] args) {

       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//Even numb
          List<Integer> evenList = numbers.stream()
           .filter(e -> e%2==0)
           .collect(Collectors.toList());
                 System.out.println(evenList);

                 //Odd numb
                 List<Integer> OddList = numbers.stream ()
                 .filter(e -> e%2!=0)
                  .collect(Collectors.toList());
                 System.out.println(OddList);

    }
}
