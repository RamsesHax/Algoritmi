package hackerranksolving;

public class Main {
		
	//se va decomenta setul de cod de sub numele algoritmului ce vrea sa se testeze
	//detalii despre fiecare algoritm in parte se gasesc in clasa respectivului  algoritm
		
	public static void main(String[] args) {
		int[][] test = {{0 ,1 ,2 ,3 ,4 , 5},
						{6 ,7 ,8 ,9 ,10,11},
						{12,13,14,15,16,17},
						{18,19,20,21,22,23},
						{24,25,26,27,28,29},
						{30,31,32,33,34,35}} ;
		int[] testPair = {1,1,3,3,4,5,6,5,5,5,5};
		int[] testCloudsJump= {0,1,0};
		int[] rotLeft = {1, 2, 3, 4, 5};
		int[] newYearChaos = {1, 2, 5, 3, 7, 8, 6, 4};
		
		
		//----------hourglassSum
		//System.out.println(hourglassSum.hourglassSumAlgo(test));
		
		//----------pair
		//System.out.println(pair.find(testPair));
		
		//----------clouds
		//System.out.println(clouds.jump(testCloudsJump));
		
		//----------InfiniteString
		//System.out.println(InfiniteString.find("abaaacc", 47));
		
		
		//-----LeftRotation
		//rotLeft = LeftRotation.rotLeft(rotLeft,2);
		//for (int i = 0 ; i<rotLeft.length ; i++) {
		//	System.out.println(rotLeft[i]);
		//}
		
		
		//-------NewYearChaos
		//NewYearChaos.minimumBribes(newYearChaos);
	}
	
}

