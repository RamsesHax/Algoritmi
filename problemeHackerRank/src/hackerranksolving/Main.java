package hackerranksolving;

public class Main {

	public static void main(String[] args) {
		int[][] test = {{0 ,1 ,2 ,3 ,4 , 5},
						{6 ,7 ,8 ,9 ,10,11},
						{12,13,14,15,16,17},
						{18,19,20,21,22,23},
						{24,25,26,27,28,29},
						{30,31,32,33,34,35}} ;
		int[] testPair = {1,1,3,3,4,5,6,5,5,5,5};
		int[] testCloudsJump= {0,1,0};

		System.out.println(hourglassSum.hourglassSumAlgo(test));
		System.out.println(pair.find(testPair));
		System.out.println(clouds.jump(testCloudsJump));
		System.out.println(InfiniteString.find("abaaacc", 47));
	}
	
}

