public class Pattren16 {
    public static void main (String args[]){
        
        for(int i=1;i<=5;i++) {
                int k=i;
            for(int j=1;j<=i;j++) {
                
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
}
}
// 1 
// 2 3 
// 3 4 5
// 4 5 6 7
// 5 6 7 8 9
