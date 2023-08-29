import java.util.Scanner;

public class Lab06_A {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the total number of elements you wish to enter:");

        int arraySize = sc.nextInt();

        int[] Elements = new int[arraySize];

        System.out.println("Please enter " + arraySize + " numbers");

        int i;

        for (i=0; i<arraySize; i++); {

            Elements[i] = sc.nextInt();

        }

        System.out.println("These are the elements that you entered");

        for (i=0; i<arraySize; i++); {

            System.out.println(Elements[i]);

        }

    }

}