package streams;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
            String str="Excelsoft";
            if(IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1))) {
                System.out.println("Given String is a Palindrome");
            }
            else {
                System.out.println("Given String is not a Palindrome");
            }
        }
    }

