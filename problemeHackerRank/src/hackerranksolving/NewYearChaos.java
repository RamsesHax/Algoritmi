package hackerranksolving;

public class NewYearChaos {
	
	//Imagine a line of people waiting to enter the concert.
	//Everyone has a ticket with the current position(equivalent to array position).
	//They can bribe a maximum of 2 people in front of them to advance in position.
	//A matrix with numbers is given and it must be determined how many bribes have taken place(the minimum).
	//If more than 2 bribes have been made, "Too chaotic" is displayed, otherwise the minimum number of bribes is displayed. 
	//example : {1, 2, 3, 4} (original state with 4 people waiting) -> {1,4,2,3} (after 2 bribes made by 4}

	public static void minimumBribes(int[] q) {
	   
		int bribes = 0;		boolean allgood = true;
		
		int firstExpect = 1;	int secondExpect = 2;	int thirdExpect = 3;	
		
		for(int i = 0 ; i<q.length; i++) {
			
			if((q[i] - (i+1))>2){
				System.out.println("Too chaotic");
				allgood = false;
				break;
				
			}else if(q[i]==firstExpect) {
				firstExpect = secondExpect;
				secondExpect = thirdExpect;
				thirdExpect++;
				
			}else if(q[i] == secondExpect) {
				bribes++;
				secondExpect = thirdExpect;
				thirdExpect++;
				
			}else if(q[i] == thirdExpect) {
				bribes+=2;
				thirdExpect++;
			}
		}
		if(allgood) {
			System.out.println(bribes);
		}
	    }
	
}
