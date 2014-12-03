package com.company;
import java.io.*;
import java.io.IOException;
import java.lang.String;
import java.util.Scanner;

import static java.lang.System.out;
public class Main {

    public static void main(String[] args) throws IOException {
        String a ="";
        Scanner in = new Scanner(System.in);
        StringOperator stringOperator = new StringOperator();
        FindWord findWord = new FindWord();
        findWord.myText =  stringOperator.readFile("C:/TestData/text.txt");
        System.out.println("This is the text:");
        System.out.println(findWord.myText);
       // findWord.calculateLength();
       // System.out.println("Length of text is:");
       // System.out.println(findWord.len);
        //System.out.println(currentWord[1]);
        System.out.println("What word are you looking for?");
        a = in.nextLine();
        findWord.finalNumber(a);

    }
}
