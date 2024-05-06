package patteren;

public class Pattren28 {
	public static void main(String[] args) {
		int z=1;
		int n=5;
		for(int i=0; i<=n; i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(z%2 + " ");
				z++;
			}System.out.println();
		}
	}	
}
//          1
//        0 1 0
//      1 0 1 0 1 
// 	  0 1 0 1 0 1 0
//	1 0 1 0 1 0 1 0 1