package streams;

import java.util.stream.Stream;

public class fiboSeries {
    public static void main(String[] args) {
        
		System.out.print("Fibonacci Series is:");
		Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(x->System.out.print(x+" "));
		System.out.println();
    }
}
