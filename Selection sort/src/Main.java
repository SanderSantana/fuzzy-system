import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        double[] grades = getGrades();
        double[] sortedGrades = (sortGrades(grades));

        for(int i = 0; i < grades.length; i++) {

            System.out.print(sortedGrades[i] + " ");
        }
    }

    public static double[] getGrades() {

        double[] grades = new double[10];

        System.out.println("Enter mark:");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {

            grades[i] = sc.nextDouble();

        }

        return grades;

    }

    public static double[] sortGrades(double grades[]) {

        for(int i = 0; i < grades.length; i++) {

            int min = i;

            for(int j = i + 1; j < grades.length; j++) {

                if(grades[j] < grades[min]) {

                    min = j;

                }

            }

            double temp = grades[i];
            grades[i] = grades[min];
            grades[min] = temp;

        }

        return grades;

    }


}