package utilsmk44;

import utilsmk44.RandomAnswers;

import java.util.Random;

/**
 * Created by Jeff on 11/2/2014.
 */
public class Utilsmk44
{
    public static void main(String[] args)
    {
        System.out.println("main started");
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.run();

        StringLength stringLength = new StringLength();
        System.out.println(stringLength.calculateStringLength("hello" ));

<<<<<<< HEAD
        ProblemOne problemOne = new ProblemOne();
        problemOne.allUnique("wazskl");

       // LongestOverlap longestOverlap = new LongestOverlap();
        //longestOverlap.LongestOverl("hey how are you", "hey you" );

        RandomAnswers randomAnswers = new RandomAnswers();
        randomAnswers.answer();

=======
        Problem3 problem3 = new Problem3();
        problem3.allUnique("wazssl");
>>>>>>> origin/master
    }
}
