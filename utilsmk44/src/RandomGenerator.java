
import java.util.Random;

public class RandomGenerator
{
    public static void run ()
    {
        int countLessThenTen = 0;
        Random rn = new Random();
        int[] randomArray = new int[100];

        for(int i= 0;i<40;i++ )
        {
            randomArray[i] = rn.nextInt(100);
            System.out.println(randomArray[i]);
            if(randomArray[i]<=10)
            {
                countLessThenTen++;
            }
        }
        System.out.println("there were " +countLessThenTen);
    }
 }








