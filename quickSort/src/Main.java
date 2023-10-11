public class Main {

    public static void main(String[]args){

        int[] nums = {5, 4, 8, 3, 7, 0, -1, 13, 5};

        quickSort(nums, 0, nums.length - 1);

        for(int i = 0; i < nums.length; i++) {

            System.out.print(nums[i] + " ");

        }

    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {

            return;

        }

        int pivot = highIndex;

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while( leftPointer < rightPointer) {

            while (array[leftPointer] <= array[pivot] && leftPointer < rightPointer) {

                leftPointer++;

            }

            while (array[rightPointer] >= array[pivot] && leftPointer < rightPointer) {

                rightPointer--;

            }

            if(leftPointer < rightPointer) {

                int temp = array[leftPointer];
                array[leftPointer] = array[rightPointer];
                array[rightPointer] = temp;


            }


        }

        int temp = array[pivot];
        array[pivot] = array[leftPointer];
        array[leftPointer] = temp;


        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

    }

}