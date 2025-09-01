import java.util.Scanner;

public class Student_Registration {


    public static void displayStudents(String[] students) {
        System.out.println("Registered Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    // Reusable method to compare two Strings
    public static void compareStrings(String s1, String s2) {
        System.out.println("Compare \"" + s1 + "\" and \"" + s2 + "\":");
        System.out.println((s1==s2));
        System.out.println(s1.equals(s2));
    }

    // Search using switch-case
    public static void searchStudentSwitch(String[] students, String name) {
        boolean found = false;
        for (String student : students) {
            switch (student) {
                case "Namit":
                case "Naman":
                case "Anant":
                case "Raj":
                    if (student.equals(name)) {
                        found = true;
                    }
                    break;
                default:
                    if (student.equals(name)) {
                        found = true;
                    }
            }
            if (found) break;
        }
        if (found) {
            System.out.println("Student Registered");
        } else {
            System.out.println("Student Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student names
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

        displayStudents(students);

        System.out.println("\n--- SCP Demo ---");
        String str1 = "Namit";
        String str2 = "Namit";
        String str3 = new String("Namit");
        compareStrings(str1, str2);
        compareStrings(str1, str3);

        System.out.println("\n--- Immutability Demo ---");
        String originalName = students[0];
        System.out.println("Original Name: " + originalName);
        String modifiedName = originalName + " Kumar";
        System.out.println("Modified Name: " + modifiedName);
        System.out.println("Original Name after concatenation: " + originalName);

        System.out.println("\n--- Search Feature using switch-case ---");
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        searchStudentSwitch(students, searchName);

        System.out.println("\n--- StringBuffer & StringBuilder Demo ---");
        StringBuffer sb = new StringBuffer(originalName);
        sb.append(" Singh");
        sb.insert(0, "Mr. ");
        sb.delete(0, 3);
        System.out.println("StringBuffer final: " + sb + " (thread-safe)");

        StringBuilder sbd = new StringBuilder(originalName);
        sbd.append(" Singh");
        sbd.insert(0, "Ms. ");
        sbd.delete(0, 3);
        System.out.println("StringBuilder final: " + sbd + " (faster but not synchronized)");

        sc.close();
    }
}

    

