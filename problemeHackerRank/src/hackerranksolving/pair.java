package hackerranksolving;

import java.util.Stack;

public class pair{
									//cate numere sunt perechi in sir?
	
	static int find(int arr[]) {
		Stack<Integer> stack = new Stack<Integer>();
        for(int m = 0 ; m < arr.length ; m++){
            stack.add(arr[m]);
        }
        stack.sort(null);
        for ( int i = 0 ; i < arr.length ; i++) {
            arr[i] = stack.get(i);
        }
        int i=0, res=0;
        while(i<arr.length){
            int number = arr[i];
            int count = 1;
            i++;

            while(i<arr.length && arr[i] == number){
                count++;
                i++;
            }
            if(count>=2){
                res=res+count/2;
            }
        }
        return res;
	}
	
}
