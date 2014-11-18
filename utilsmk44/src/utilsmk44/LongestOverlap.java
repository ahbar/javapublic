package utilsmk44;
import java.lang.*;
/**
 * Created by boris on 11/17/2014.
 */
public class LongestOverlap {
    public String LongestOverl(String x, String y) {
        int start = 0;
        int max = 0;
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                int z = 0;
                while (x.charAt(i + z) == x.charAt(j + z)) {
                    z++;
                    if (((i + z) >= x.length()) || ((j + z) >= y.length()))
                        break;

                }
                if (z > max) {
                    max = z;
                    start = i;
                }
            }
            return x.substring(start,(start + max));
        }


    }


}









