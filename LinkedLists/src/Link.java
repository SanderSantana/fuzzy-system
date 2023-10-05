import java.util.Scanner ;

public class Link {

    public static void main(String[]args) {

        int arraySize;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of elements you wish to enter: ");
        arraySize = sc.nextInt();

        int[] nums = new int[arraySize];

        System.out.print("Please enter numbers:");

        for (int i = 0; i < arraySize; i++) {

            nums[i] =sc.nextInt();

        }

        System.out.print("Please enter number to be found: ");
        int findNum = sc.nextInt();

        int index = linearsearch(nums, findNum, arraySize);

        if (index != -1) {

            System.out.print("The index position is " + index);

        }

        else {

            System.out.print("Number not found");

        }



    }

    private static int linearsearch(int[] nums, int value, int arraySize) {

        for (int i = 0; i < arraySize; i++) {

            if (nums[i] == value) {

                return i;

            }

        }

        return -1;
    }

}