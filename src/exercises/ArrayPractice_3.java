package exercises;


import java.util.Arrays;
public class ArrayPractice_3 {
    public static void main(String[] args) {
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

//        int maxWords = 40;

        String[] seussArray = seuss.split("\\.");

        System.out.println(Arrays.toString(seussArray));
        }
    }
