package streams;

import java.util.Arrays;
import java.util.List;

public class LastElement {
   public static void main(String[] args) {
    List<String> strlist=Arrays.asList("Niveditha","Aishu","Varsha","Rashmi");
		String lastEle=strlist.stream().skip(strlist.size()-1).findFirst().get();
		System.out.println(lastEle);
   } 
}
