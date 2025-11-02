import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎓 STUDENT GRADE CALCULATOR 🎓");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Step 1: Take marks input
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter marks obtained in Subject " + (i + 1) + " (out of 100): ");
                int mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    totalMarks += mark;
                    break;
                } else {
                    System.out.println("⚠️ Invalid input! Marks should be between 0 and 100.");
                }
            }
        }

        // Step 2: Calculate total marks
        System.out.println("\nTotal Marks Obtained: " + totalMarks + " out of " + (numSubjects * 100));

        // Step 3: Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Step 4: Grade calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Step 5: Display results
        System.out.println("Grade: " + grade);

        // Optional feedback
        switch (grade) {
            case 'A':
                System.out.println("🌟 Excellent! Keep up the great work!");
                break;
            case 'B':
                System.out.println("👍 Very Good! You did really well!");
                break;
            case 'C':
                System.out.println("😊 Good! But there’s room for improvement.");
                break;
            case 'D':
                System.out.println("🙂 Fair effort. Try to do better next time.");
                break;
            case 'E':
                System.out.println("😐 Needs improvement. Keep practicing!");
                break;
            default:
                System.out.println("❌ Failed. Don’t give up—work harder next time!");
        }

        sc.close();
    }
}
