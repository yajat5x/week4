import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }
}

public class StudentPerformanceManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(roll, name, marks, attendance);
        }

        double highestAverage = -1;
        Student topStudent = null;

        System.out.println("\n===== STUDENT PERFORMANCE =====");

        for (int i = 0; i < 5; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++)
                total += students[i].marks[j];

            double average = total / 3.0;

            String result = average >= 50 ? "Pass" : "Fail";
            String scholarship = average >= 75 && students[i].attendance >= 80
                    ? "Eligible" : "Not Eligible";
            String performance = average >= 85 ? "Excellent" : "Good";

            System.out.println("\nRoll Number: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Result: " + result);
            System.out.println("Scholarship: " + scholarship);
            System.out.println("Performance: " + performance);

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = students[i];
            }
        }

        System.out.println("\n===== HIGHEST AVERAGE =====");
        System.out.println("Roll Number: " + topStudent.rollNo);
        System.out.println("Name: " + topStudent.name);
        System.out.println("Average: " + highestAverage);

        sc.close();
    }
}