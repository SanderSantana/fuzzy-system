import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] marks = {3, 7, 15, 21, 23, 43, 57, 61, 68, 87};

        System.out.print("What number are you searching for: ");
        Scanner sc = new Scanner(System.in);
        int numToFind = sc.nextInt();

        int index = binarySearch(marks, numToFind);

        if (index != -1) {

            System.out.print("Element " + numToFind + " is at index " + index);

        }
        else {

            System.out.print("Number doesn't exist");

        }

    }

    private static int binarySearch(int[] array, int target) {

        int lowerBound = 0;
        int higherBound = array.length - 1;

        while (lowerBound <= higherBound) {

            int mid = (lowerBound + higherBound) / 2;

            if (target == array[mid]) {

                return mid;

            }

            else if (target > array[mid]) {

                    lowerBound = mid + 1;

            }

            else {

                higherBound = mid - 1;

            }

        }

        return -1;
    }

}