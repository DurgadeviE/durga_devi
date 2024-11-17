import java.util.Scanner;

public class Main {
         public static double calculateCGPA(double[] grades, int[] credits) {
        double totalGradePoints = 0;
        int totalCredits = 0;
    
            for (int i = 0; i < grades.length; i++) {
            totalGradePoints += grades[i] * credits[i];  // Grade points = Grade * Credits
            totalCredits += credits[i];  // Total credits
        }
        
        return totalGradePoints / totalCredits;  // CGPA = Total Grade Points / Total Credits
    }
    
    public static double calculateCGPA(int[] marks, int totalSubjects) {
        double totalGradePoints = 0;
        
        for (int i = 0; i < marks.length; i++) {
            totalGradePoints += convertToGradePoint(marks[i]);  // Convert marks to grade points
        }
        
        return totalGradePoints / totalSubjects;  // CGPA = Total Grade Points / Number of Subjects
    }

      public static double calculateCGPA(double totalGradePoints, int totalCredits) {
        return totalGradePoints / totalCredits;  // CGPA = Total Grade Points / Total Credits
    }

    private static double convertToGradePoint(int marks) {
        if (marks >= 90) {
            return 10.0;
        } else if (marks >= 80) {
            return 9.0;
        } else if (marks >= 70) {
            return 8.0;
        } else if (marks >= 60) {
            return 7.0;
        } else if (marks >= 50) {
            return 6.0;
        } else if (marks >= 40) {
            return 5.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();
        
        double[] grades = new double[numSubjects];
        int[] credits = new int[numSubjects];
        
        System.out.println("Enter the grades and credits for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Grade for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }

        double cgpa1 = calculateCGPA(grades, credits);
        System.out.println("Your CGPA (using grades and credits) is: " + cgpa1);
        
        System.out.println("\nEnter marks for each subject to calculate CGPA:");
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        double cgpa2 = calculateCGPA(marks, numSubjects);
        System.out.println("Your CGPA (using marks) is: " + cgpa2);
        System.out.println("\nEnter total grade points and total credits to calculate CGPA:");
        System.out.print("Total Grade Points: ");
        double totalGradePoints = sc.nextDouble();
        System.out.print("Total Credits: ");
        int totalCredits = sc.nextInt();
        double cgpa3 = calculateCGPA(totalGradePoints, totalCredits);
        System.out.println("Your CGPA (using total grade points and credits) is: " + cgpa3);
        
        sc.close();
    }
}
