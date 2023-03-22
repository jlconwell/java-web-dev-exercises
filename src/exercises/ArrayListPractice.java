package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(SumEven(numbers));


        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] seussArray = seuss.split(" ");
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(seussArray));
//        words.add("a");
//        words.add("ab");
//        words.add("abc");
//        words.add("abcd");
//        words.add("abcde");
//        words.add("edcba");
//        words.add("dcba");
//        words.add("cba");
//        words.add("ba");
//        words.add("a");

        System.out.println(words);
        FiveLetters(words);
    }


        public static int SumEven (ArrayList < Integer > arr) {
            int totalSum = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    totalSum += integer;
                }
            }
            return totalSum;
        }

        public static void FiveLetters (ArrayList < String > arr) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length 1-5:");
        double userLength = input.nextDouble();

        for (String word : arr) {
                if (word.length() == userLength) {
                    System.out.println(word);
                }
            }
        }
    }