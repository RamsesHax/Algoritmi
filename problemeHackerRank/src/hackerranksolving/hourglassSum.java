package hackerranksolving;

import java.util.Stack;

public class hourglassSum {
static int hourglassSumAlgo(int[][] arr) {
		
		int[] valori = new int[36];		int m = 0 ;		int sumatemp = 0 ;
			
			for (int i = 0 ; i< arr.length ; i ++) {
				for (int j = 0 ; j<arr[i].length; j++) {
					valori [j+m]=arr[i][j];
					if(j==arr[j].length-1) {
						m+=6;
					}
				}
			}
			
		Stack<Integer> sume = new Stack<Integer>();
		m=0; 	int limita1 = 7; 	int start1 = 0; 	int counter1 =2; 	int counter2=3;
			
	for(int d = 0 ; d < 4 ; d++) {		
		for(int j = 0 ; j < 4 ; j ++) {
			for(int i = start1  ; i <limita1  ; i ++) {
				sumatemp+=valori[i+m];
				start1 ++;
				if(i== counter1|| i==counter2) {
					m+=4;;
					}		
				}
			sume.add(sumatemp);
			sumatemp = 0;
			m = 0; limita1 +=1; start1 -= 6; counter1++;counter2++;
			}
		m=0 ; start1+=2; limita1+=2; counter1 +=2 ; counter2 +=2;
		}
		sume.sort(null);
	
	return sume.get(sume.size()-1);
	}
		
		
}
