public class ArrayMaximalAdjacentDifference {


    public static void main(String[] args) {

        int[] testArray = {2, 4, 1, 0};

        System.out.println(arrayMaximalAdjacentDifference(testArray));


    }


    // example [2, 4, 1, 0]
    // out - 3
    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int temp = inputArray[0] - inputArray[1];
        for (int i = 0; i < inputArray.length-1; i++) {
            int number = inputArray[i] - inputArray[i+1];
            if(number < 0 ){
                number = number * -1;
            }
            if (temp < number) {
                temp = number;
            }
        }

        return temp;

    }


}
