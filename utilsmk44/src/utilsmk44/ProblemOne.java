package utilsmk44;

/**
 * Created by boris on 11/3/2014.
 */
public class ProblemOne {
    public void allUnique(String word) {
        boolean[] chars = new boolean[26];
        String upperLetter = word.toUpperCase();

        for (int i = 0; i < upperLetter.length(); i++)
        {
            if (!chars[(int) upperLetter.toUpperCase().charAt(i) - 64])
            {
                chars[(int) upperLetter.toUpperCase().charAt(i) - 64] = true;
            }
            else
            {
                System.out.println("not unique ");
            }
        }
        System.out.println("unique");
    }

}
