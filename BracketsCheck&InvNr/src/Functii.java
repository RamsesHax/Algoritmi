import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Functii {
	
	private int brackets(String expression) {
		char[] charsOfExp = expression.toCharArray();	
		
		Stack<Character> st = new Stack<Character>();
		
		List<Character> openB = new ArrayList<Character>();
		openB.add('{');
		openB.add('[');
		openB.add('(');
		
		List<Character> closeB = new ArrayList<Character>();
		closeB.add('}');
		closeB.add(']');
		closeB.add(')');
		
		int pozitiaParantezeiInchise;
		
		for (char ch : charsOfExp) {
			
			if (openB.contains(ch)) {
					st.add(ch);
			}	
			else if(closeB.contains(ch)) {
				pozitiaParantezeiInchise = closeB.indexOf(ch);
					if (st.size()>0 && openB.get(pozitiaParantezeiInchise).equals(st.get(st.size() - 1))) {
						st.pop();
					}
					else {
						return 0;
					}
			}
		}
			
		if(st.size()==0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public void functieParanteze(String expression) {
		int x = brackets(expression);
		if (x == 1) {
			System.out.println("balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}
	
	public void inversareNumar(int number) {
		int b = number;
		if (b<0) {
		b = number * -1;
		}
		int reverse = 0 ;
		
		while(b != 0) {
			reverse = reverse * 10 ;
			reverse = reverse + b % 10 ;
			b =b / 10;
		}
		
		if (number < 0) {
			System.out.println(reverse * -1);
		}else {
			System.out.println(reverse);
		}
	}
}
