import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        int[] grades = getGrades();
        sortedGrades(grades);

    }

    private static void sortedGrades(int[] grades) {

        for(int i = 1; i < grades.length; i++) {

            int temp = grades[i];
            int j = i - 1;

            while(j >= 0 && grades[j] > temp) {

                grades[j + 1] = grades[j];
                j --;

            }

            grades[j + 1] = temp;

        }

        System.out.print("The correct order of grades is: ");

        for(int i = 0; i < grades.length; i++) {

            System.out.print(grades[i] + " ");

        }

    }

    private static int[] getGrades() {

        Scanner size = new Scanner(System.in);

        System.out.print("What is the size of the array?");
        int arraySize = size.nextInt();

        int[] grades = new int[arraySize];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arraySize; i++) {

            int j = i + 1;

            System.out.print("Enter grade for student (" + j + "):");
            grades[i] = sc.nextInt();

        }

        return grades;

    }

}