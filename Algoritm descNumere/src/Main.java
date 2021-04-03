import java.lang.Math;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		for(int i=0 ; i<49001 ; i++) {	// returneaza cel mai mic numar la cea mai mica putere (dupa descompunere)
		System.out.println(putere (i)); // ex1: 49000= 5^3 * 7^2 * 2^3 -> return 7
		}								// ex2:	36= 2^2 *3^2 -> return 2
	}										

	static int putere(int n) {
		if(n == 0) {
			return n;
		}
		int j = 2; int ans1 = n ; int ans = 40 ; int x = n;
		if (n < 0) {
			x = x * -1;
		}
		while(x != 1) {
			int cnt =0;
			while(x%j == 0) {
				cnt ++;
				x/= j;
			}
			if (cnt != 0) {
				if(cnt==ans) {
					ans1 = Math.min(ans1,j);
				}
				else if ( cnt<ans ) {
					ans1 = j ; ans = cnt ;
				}
			}
			if (j == 2) {
				j++;
			}
			else {
				j += 2;
			}
			if(j*j>x) {
				j=x;
			}
		}
		if(n < 0 && ans1 == n*-1) {
			return n;
		}else {
			return ans1;
			}
	}
}


