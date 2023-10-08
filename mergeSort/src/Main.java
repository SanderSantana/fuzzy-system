public class Main{

    public static void main(String[]args) {

        int[] marks = {20, 57, 6, 37, 73, 89, 23, 51, 17, 8, 27};

        mergeSort(marks);

        for(int i = 0; i < marks.length; i++) {

            System.out.print(marks[i] + " ");

        }

    }

    private static void mergeSort(int[] marks) {

        int marksLength = marks.length;

        if (marksLength < 2) {

            return;

        }

        int mid = marksLength / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[marksLength - mid];

        for( int i = 0; i < mid; i++) {

            leftHalf[i] = marks[i];

        }

        for (int i = mid; i < marksLength; i++) {

            rightHalf[i - mid] = marks[i];

        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(marks, leftHalf, rightHalf);

    }

    private static void merge(int[] marks, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) {

                marks[k] = leftHalf[i];
                i++;

            }

            else {

                marks[k] = rightHalf[j];
                j++;

            }

            k++;

        }

        while ( i < leftSize) {

            marks[k] = leftHalf[i];
            i++;
            k++;

        }

        while (j < rightSize) {

            marks[k] = rightHalf[j];
            j++;
            k++;

        }

    }

}