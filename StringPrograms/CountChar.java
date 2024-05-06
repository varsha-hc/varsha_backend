import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        String s= "Excelsoft";
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!= ' ')
            count++;
      }
      System.out.println("Total number : "+count);
    }
}
