package hackerranksolving;

				//A left rotation operation on an array shifts each of the array's elements unit to the left.
				// ex: [1,2,3,4,5] with 2 left rotations -> [3,4,5,1,2]
public class LeftRotation {
	static int[] rotLeft(int[] a, int d) {
			
		int[] result =new int[a.length];
		
			int contor = 0 ;	
			
			for(int i = 0 ; i <a.length;i++) {
				if(i>=d) {
				result[contor] = a[i];
				contor++;
				}
		}
			for(int i = 0 ; i <d ; i++) {
				result[contor] = a[i];
				contor++;
			}
			
		return result;
    }
}
