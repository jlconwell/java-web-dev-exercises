package exercises;

public class ArrayPractice_1_2 {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for ( int number :integerArray) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
