import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        float[] marks = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextFloat();
        }

        float totalMarks = 0;
        for (float mark : marks) {
            totalMarks += mark;
        }

        float averagePercent= totalMarks / n;

        String grade;
        if (averagePercent >= 90) {
            grade = "A";
        } else if (averagePercent >= 80 && averagePercent < 90) {
            grade = "B";
        } else if (averagePercent >= 70 && averagePercent < 80) {
            grade = "C";
        } else if (averagePercent >= 60 && averagePercent < 70) {
            grade = "D";
        } else if (averagePercent>=50 && averagePercent<60){
            grade = "E";
        }else{
            grade ="F";
        }
            
        

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercent);
        System.out.println("Grade: " + grade);
    }
}