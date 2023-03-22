package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapExercise {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your Students name (or Enter to finish)");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID Number: ");
                Integer idNumber = input.nextInt();
                students.put(newStudent, idNumber);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

    System.out.println("Class Roster: ");

    for (Map.Entry<String, Integer> student : students.entrySet()) {
        System.out.println(student.getKey() + " ID: " + student.getValue());
    }

    }
}
