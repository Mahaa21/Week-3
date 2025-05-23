import java.util.Scanner;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printMarks(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] studentMarks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        System.out.println("Marks before sorting:");
        printMarks(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("Marks after sorting in ascending order:");
        printMarks(studentMarks);

        scanner.close();
    }
}
