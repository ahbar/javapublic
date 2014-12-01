import java.lang.*;

public class LongestOverlap
{
    public String LongestOverl(String x, String y)
    {
        int start = 0;
        int max = 0;
        for (int i = 0; i < x.length(); i++)
        {
            for (int j = 0; j < y.length(); j++)
            {
                int z = 0;
                while (x.charAt(i + z) == x.charAt(j + z))
                {
                    z++;
                    if (((i + z) >= x.length()) || ((j + z) >= y.length()))
                        break;
                }
                if (z > max)
                {
                    max = z;
                    start = i;
                }
            }
        }
        return x.substring(start, (start + max));
    }

    public String longestCommonSubstring(String s1, String s2)
    {
        int start = 0;
        int biggestLength = 0;
        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i < len1; i++)
        {
            for (int j = 0; j < len2; j++)
            {
                int offset = 0;
                while (s1.charAt(i + offset) == s2.charAt(j + offset))
                {
                    offset++;
                    if (((i + offset) >= len1) || ((j + offset) >= len2)) break;
                }
                if (offset > biggestLength)
                {
                    biggestLength = offset;
                    start = i;
                }
            }
        }
        return s1.substring(start, (start + biggestLength));
    }

    public String getLongestOverlap(String s1, String s2)
    {
        System.out.println("overlap started");
        int len1 = s1.length();
        int len2 = s2.length();
        String longestOverlap = "";
        for (int i=0; i<len1; i++)
        {
            for (int j=0; j<len2; j++)
            {
               if (s1.charAt(i) == s2.charAt(j))
                {
                   longestOverlap = s1.substring(i, i+j+1);
                }
            }
        }
        return longestOverlap;
    }
}

/*
s1, s2
find first matchihng letters
 */







