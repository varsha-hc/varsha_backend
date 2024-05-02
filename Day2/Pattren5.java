public class Pattren5{
    public static void main(String[] args) {
        
        for (int i=1; i<=4; i++)
        {
            for (int j=4; j>=i; j--){
                System.out.print( " ");
            }
            for (int k=1; k<=i; k++)
            System.out.print(k+ " ");
           System.out.println();
    }
}

}
//    1
//   1 2
//  1 2 3
// 1 2 3 4