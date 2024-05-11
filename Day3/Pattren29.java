package patteren;

public class Pattren29{
public static void main(String[] args) {
		int n=1;
		for(int i=1; i<=6;i++){
			n=i;
			for(int j=1; j<i;j++) {
				n--;
			System.out.print(n+" ");
			}
			System.out.println("");
		}
 	}
}
//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 