package utilsmk44;
import java.util.Random;
/**
 * Created by boris on 11/2/2014.
 */
        class random {
    public static void main(String args[]) {
        int coun;
        int i=0;
        Random rn = new Random();
        int[] randomArray = new int[100];

        for(coun=1;coun <= 40; coun++) {
            randomArray[coun] = rn.nextInt(100);
            System.out.println(randomArray[coun]);
            
           }

    }


        }








