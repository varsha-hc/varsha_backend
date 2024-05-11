package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SortReverseOrder {
    public static void main(String[] args) {
        
            List<Integer> list=Arrays.asList(4,6,2,8,5,1,9);
            list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);	
            System.out.println();
        }
    }

