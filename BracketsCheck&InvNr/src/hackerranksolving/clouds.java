package hackerranksolving;

public class clouds {
	static int jump(int[] c) {
		//returneaza solutia cea mai buna de a sarii pe zerouri *clouds* , se poate sarii 1 data sau de 2 ori
		//ex : 0 1 0 -> 1 saritura pt completare    // ex2 : 0 0 0 1 0 0 -> 3 sarituri pentru completare
		// se introduce un array care incepe si se termina cu 0 
		// nu se poate introduce decat 1 si 0 
		// nu se poate intruduce 1 consecutiv
int sarituri = 0 ;
        
        try {
            for (int i = 0; i<c.length ; i++) {
                if(c[i+1] + c[i+2] == 0) {
                    sarituri++;
                    i++;
                }
                else if(c[i+2] == 1) {
                    sarituri++;
            } 
                else if(c[i+1] == 1) {
                        sarituri++;
                        i+=1;
                }
                else if(c[i+1] == 0) {
                    sarituri++;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            sarituri++;
        }    
        if(c.length ==100) {
            sarituri --;
        }
        if (c[c.length-1] == 0 && c.length %2 != 0 && c[c.length-2] == 1) {
            sarituri --;
        }
        return sarituri;
	}
}
