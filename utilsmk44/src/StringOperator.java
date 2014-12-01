
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Jeff on 11/29/2014.
 */
public class StringOperator
{
    Charset charset = StandardCharsets.UTF_8;

    public String readFile(String path) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, charset);
    }

    public List<String> readLinesFromFile (String path) throws IOException
    {
        List<String> lines = Files.readAllLines(Paths.get(path), charset);
        return lines;
    }

    public void writeLinesToFile (List<String> lines, String path)
    {

    }

    public void normalizeString(String input)
    {
        // make all capital

        // reduce to single space
    }

    public void test1() throws IOException
    {
        String path = "C:/testData/text1.txt";
        String result = readFile(path);
        System.out.println(result);
    }

}
