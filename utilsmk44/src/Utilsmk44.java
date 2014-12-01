import java.io.IOException;

/**
 * Created by Jeff on 11/2/2014.
 */
public class Utilsmk44
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("main started");

        //RandomGenerator randomGenerator = new RandomGenerator();
        //randomGenerator.run();

        //StringLength stringLength = new StringLength();
        //System.out.println(stringLength.calculateStringLength("hello" ));

        //LongestOverlap longestOverlap = new LongestOverlap();
        //longestOverlap.LongestOverl("hey how are you", "hey you" );

        //Problem3 problem3 = new Problem3();
        //problem3.allUnique("wazssl");

        LongestOverlap longestOverlap = new LongestOverlap();
        //System.out.println("longest overlap is: " + longestOverlap.getLongestOverlap("ff", "jeffddd"));
        //System.out.println("longest overlap is: " + longestOverlap.LongestOverl("ff", "jeffddd"));
        System.out.println("longest overlap is: " + longestOverlap.longestCommonSubstring("efmm111", "jeffddd"));

        StringOperator stringOperator = new StringOperator();
        stringOperator.test1();
    }
}
