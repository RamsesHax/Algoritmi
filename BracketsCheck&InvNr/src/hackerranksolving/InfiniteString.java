package hackerranksolving;

public class InfiniteString {
	//There is a string, s , of lowercase English letters that is repeated infinitely many times. 
	///Given an integer, n , 
	//find and print the number of letter a's in the first letters of the infinite string.
	//Example:
	//s = 'abcac' , n=10; ->The substring we consider is 'abcacabcac'
						//-> the first 10 characters of the infinite string. 
						//->There 4 are occurrences of a in the substring. 
	
	static long find(String s, long n) {
		long deInmultit = 0;
        deInmultit = n / s.length(); //partea intreaga cu care inmultim numarul de a-uri din stringul repetitiv.
        long restPentruString = n % s.length(); // restul de caractere din stringul repetitiv
        
        long aINs = 0; //stocam numarul de a-uri din stringul repetitiv.
        
        
        //-----aflam cati "a" avem in stringul repetitiv.
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == 'a') {
                aINs++;
            }
        }
        
        
        char[] restDeA = new char[(int)restPentruString  ]; //sirul ramas
        s.getChars(0, (int)restPentruString  , restDeA, 0);
        
        //-----aflam cat "a" avem in sirul ramas
        int aINsirulRamas = 0 ;
        for(int i = 0 ; i<(int)restPentruString  ; i++ ) {
            if(s.charAt(i) == 'a') {
                aINsirulRamas++;
            }
        }
        return (long)((aINs*deInmultit)+aINsirulRamas);
		
	}
}
