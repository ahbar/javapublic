package utilsmk44;
import java.util.*;
/**
 * Created by boris on 11/3/2014.
 */
public class ProblemOne {
    public static boolean allUnique(String word) {
        boolean flag = false;
        // ill convert the string to chars array;

        char[] strArray = word.toCharArray();
        //sort the characters array
        Arrays.sort(strArray);
        //compare the characters loop
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i] == strArray[i + 1]) {
                flag = true;
                System.out.println("The string is not unique");
                return flag;
            }
        }
        System.out.println("is unique");
        return flag;
    }
}