package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    public String toString() {
        String courseReport = String.format("% is taught by %.  The current student roster: ", this.topic, this.instructor, this.enrolledStudents);
        return courseReport;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor, enrolledStudents);
    }
}
