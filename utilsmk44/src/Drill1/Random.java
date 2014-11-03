package Drill1;
import java.util.Random;
/**
 * Created by boris on 11/2/2014.
 */
class random
{
    public static void main(String[] args)
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








