<<<<<<< HEAD:Day4/Palindrome.java
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

=======
import java.util.Scanner;
class Palindrome 
{
    public static void main(String[] args) {
        int n,s=0,c,r;
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not Palindrome Number");
    }
}
>>>>>>> 2f84389cd883e3e55cc4b3ded159dee510faecd8:Day3/Palindrome.java
