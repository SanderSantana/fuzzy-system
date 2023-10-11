import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        int[] marks = {20, 57, 6, 37, 73, 89, 23, 51, 17, 8, 27, 73};

        System.out.print("Please enter the element to be found:");

        Scanner sc = new Scanner(System.in);
        int findNum = sc.nextInt();

        int index = linearSort(marks, findNum);

        if ( index != - 1) {

            System.out.print("Element " + marks[index] + " was found at index " + index + " and position " + (index + 1));

        }

        else {

            System.out.print("Element was not found");

        }

    }


    private static int linearSort(int[] array, int findNum) {

        for( int i = 0; i < array.length; i++) {

            if(array[i] == findNum) {

                return i;

            }


        }

        return - 1;

    }

}