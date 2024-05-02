public class Pattern {
    public static void main (String args[]){
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
				if(j==i){
                System.out.print("1");
				}
				
				System.out.print("0");
            }
            System.out.println();
        }
	}
}
// 10000
// 01000
// 00100
// 00010
