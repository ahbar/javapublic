package com.company;


        import java.io.IOException;
        import java.lang.String;
        import static java.lang.System.out;

/**
 * Created by yuri on 2014-11-30.
 */
public class FindWord {
    String myText= "";
    int len;
    public void calculateLength ()
    {

        len = myText.length();

    }

    public int finalNumber (String wantedWord)
    {

        String[] currentWord = myText.split(" ");
        System.out.println(wantedWord);
        int counter=0;

        for (int i = 0; i<len; i++)
        {
            if (currentWord[i].contains(wantedWord))
              counter++;
                else
                System.out.println(i);
        }
        System.out.println("Wanted word was found" +counter);
        return 0;
    }


}
