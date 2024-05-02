public class Pattren13{
    public static void main(String[] args) {
        
        for (int i=1; i<= 9; i++)  
        {
            for (int j= 1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k= 9; k>=i; k--)
            {
                System.out.print(i);
            }

           System.out.println();
        }
    }
}
//  111111111
//   22222222
//    3333333
//     444444
//      55555
//       6666
//        777
//         88
//          9