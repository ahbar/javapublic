package utilsmk44;

/**
 * Created by Jeff on 11/2/2014.
 */
public class Utilsmk44 {
    public static void main(String[] args)
    {
        System.out.println("main started");
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.run();

        StringLength stringLength = new StringLength();
        System.out.println(stringLength.calculateStringLength("hello" ));
    }
}
