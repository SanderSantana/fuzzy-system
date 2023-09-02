import java.util.Scanner;

public class Lab06_D{

    public static void main(String[] args) {

        int arraySize;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array:");
        arraySize = sc.nextInt();


        double[] numbers = new double[arraySize];

        int i = 0;
        int count = arraySize;

        while (i < arraySize) {

            System.out.print("Enter a number(" + count +  " left):");
            numbers[i] = sc.nextDouble();
            i++;
            count--;


        }

        double evenSum = 0;
        double oddSum = 0;

        for (i=0; i<arraySize; i++) {

            if (numbers[i] % 2 == 0) {

                evenSum = evenSum + numbers[i];

            }

            else {

                oddSum = oddSum + numbers[i];
            }

        }

        System.out.println("Sum of even numbers is: " + evenSum);
        System.out.print("Sum of odd numbers is: " + oddSum);

    }

}