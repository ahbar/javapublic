package utilsmk44;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by boris on 11/21/2014.
 */
public class RandomAnswers {
    public void answer() {
        Scanner myScanner = new Scanner(System.in);
        Random MyRandom = new Random();
        int randomNumber;

        System.out.println("Type your question:");
        myScanner.nextLine();

        randomNumber = MyRandom.nextInt(10) + 1;

        if (randomNumber > 5)
        {
                System.out.println("The answer is yes");
        }
        else
        {
            System.out.println("the answer is wrong");
        }
    }




}
