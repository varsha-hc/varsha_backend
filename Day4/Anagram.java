import java.util.*;
public class Anagram{
     public static void main(String []args){
        String str1 = "SILENT";
        String str2 = "LISTEN";
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        if(c1.length != c2.length)
        {
            System.out.println("Not Anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++)
        {
            if (c1[i] != c2[i])
            {   
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Anagram");
     }
}