package com.technoelevate.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    String name;
    int id;
    int age;
    String gender;
    Map<String, Integer> subjectMarks;

    public Student(String name, int id, int age, String gender, Map<String, Integer> subjectMarks) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.subjectMarks = subjectMarks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Sample data for students
        Map<String, Integer> student1Marks = new HashMap<>();
        student1Marks.put("maths", 85);
        student1Marks.put("english", 90);
        student1Marks.put("science", 78);
        student1Marks.put("social", 88);
        Student student1 = new Student("Alice", 101, 25, "female", student1Marks);
        students.add(student1);

        Map<String, Integer> student2Marks = new HashMap<>();
        student2Marks.put("maths", 78);
        student2Marks.put("english", 92);
        student2Marks.put("science", 85);
        student2Marks.put("social", 80);
        Student student2 = new Student("Ramya", 102, 27, "female", student2Marks);
        students.add(student2);


        Map<String, Map<String, Integer>> studentSubjectMarks = new HashMap<>();

        for (Student student : students) {
            if ("female".equals(student.gender) && student.age > 23) {
                int originalMathMarks = student.subjectMarks.getOrDefault("maths", 0);
                int updatedMathMarks = (int) (originalMathMarks + (0.15 * originalMathMarks));

                student.subjectMarks.put("maths", updatedMathMarks);

                studentSubjectMarks.computeIfAbsent("maths", k -> new HashMap<>())
                        .put(student.name, updatedMathMarks);
            } else {
                for (String subject : student.subjectMarks.keySet()) {
                    studentSubjectMarks.computeIfAbsent(subject, k -> new HashMap<>())
                            .put(student.name, student.subjectMarks.get(subject));
                }
            }
        }

        System.out.println("Updated Student Subject Marks:");
        for (String subject : studentSubjectMarks.keySet()) {
            System.out.println(subject + ": " + studentSubjectMarks.get(subject));
        }
    }
}
