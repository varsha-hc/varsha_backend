public class Pattren12{
    public static void main(String[] args) {
        char ch='a';
        for (int i=1; i<= 5; i++)  
        {
            ch='a';
            for (int j= 1; j<=i; j++){
                System.out.print(ch+ " ");
              ch++;
             }
             System.out.println();
    }
  }
}
// a 
// a b       
// a b c     
// a b c d   
// a b c d e 