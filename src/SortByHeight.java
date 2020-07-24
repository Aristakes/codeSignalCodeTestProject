import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {

    public static void main(String[] args) {


        int[] testBubbleSortArray = {3, 1, 7, 8, 12, 0, 5};




    }


    // example  [-1, 150, 190, 170, -1, -1, 160, 180]

    // out  [-1, 150, 160, 170, -1, -1, 180, 190]


    static int[] sortByHeight(int[] a) {


        int lengthNewArray = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                //create new array and put here positive numbers
                lengthNewArray++;
            }
        }

        int[] newArray = new int[lengthNewArray];

        int number = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != -1){
                newArray[number] = a[i];
                number++;
            }
        }

        bubbleSort(newArray);

        int newNumber = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != -1){
                a[i] = newArray[newNumber];
                newNumber++;
            }
        }


        return a;
    }




    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j <array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }


}
