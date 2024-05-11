package patteren;

public class Pattren26 {
	public static void main(String[] args) {
		int n = 7;
        int x=1;
		int s=0;
		int st=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++) {
				if(j<=st/2) {
					System.out.print(x++ +" ");
				}
				else
					System.out.print(x-- +" ");
			}
			System.out.println();
			if(i<=n/2) {
				s++;
				st-=2;
				x=i+1;
			} else {
				s--;
				st+=2;
			}
		}
	}
}

//	  1 2 3 4 3 2 1 
//  	2 3 4 3 2 
// 	      3 4 3 
//    	    4 
//    	  3 4 3 
//  	2 3 4 3 2 
//	  1 2 3 4 3 2 1 
