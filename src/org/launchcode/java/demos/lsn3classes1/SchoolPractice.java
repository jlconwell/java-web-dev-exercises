package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student jakeConwell = new Student();

        jakeConwell.setName("Jake Conwell");
        jakeConwell.setGpa(4.0);
        jakeConwell.setNumberOfCredits(1);

        System.out.println(jakeConwell.getGpa());

    }

    public class Course {
        private String topic;
        private String teacher;
            ArrayList<Student> enrolledStudents;
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }
    }
}

