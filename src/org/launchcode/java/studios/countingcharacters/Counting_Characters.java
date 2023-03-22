package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Counting_Characters {
    public static void main(String[] args)
        throws IOException
    {
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a sentence:");

        Path filename = Path.of("C:\\Users\\jakel\\JakeConwell\\Desktop\\LC101\\studio text file.txt");
//        String quote = input.nextLine();
        String quote = (Files.readString(filename)).toLowerCase();

        char[] quoteCharArray = quote.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

//        System.out.println(Arrays.toString(quoteCharArray));

        for (char i : quoteCharArray) {
            if (Character.isLetter(i)) {
                if (!charCount.containsKey(i)) {
                    charCount.put(i, 1);
                } else if (charCount.containsKey(i)) {
                    charCount.put(i, charCount.get(i) + 1);
                }

            }
        }
        System.out.println(charCount);
    }
}
