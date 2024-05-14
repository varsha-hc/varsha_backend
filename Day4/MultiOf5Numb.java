package streams;
import java.util.Arrays;
import java.util.List;

public class MultiOf5Numb {
    public static void main(String[] args) {
            List<Integer> list=Arrays.asList(5,6,25,60,30,50,1,4,9);
            list.stream().filter(a->a%5==0).forEach(a->System.out.print(a+" "));
            System.out.println();
        }
    }

