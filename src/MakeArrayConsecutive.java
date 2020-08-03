public class MakeArrayConsecutive {


    public static void main(String[] args) {


        int[] testArray = {6, 2, 3, 8};
        /*bubbleSort(testArray);
        printArray(testArray);*/

        System.out.println(makeArrayConsecutive2(testArray));

    }


    // [6, 2, 3, 8]
    // 2 , 3 , 4 , 5 , 6 , 7 ,8
    // 2 , 3 , 6 , 8
    // 4 , 5  , 7
    // 3

    static int makeArrayConsecutive2(int[] statues) {

        bubbleSort(statues);

        int count = 0;

        for (int i = 0; i < statues.length - 1; i++) {
            if ((statues[i + 1] - statues[i]) != 1) {
                count = count + (statues[i + 1] - statues[i]) - 1;
            }
        }
        return count;
    }


    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
