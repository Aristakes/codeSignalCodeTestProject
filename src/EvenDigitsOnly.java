public class EvenDigitsOnly {

    public static void main(String[] args) {


        int n = 642386;//29


     //   int[] a = intConvertToArray(n);

     //   printArray(a);


        System.out.println(n%10);


    }


    // add a more line chek last index %2 == 1 and return false

    static boolean evenDigitsOnly(int n) {

        int[] a = intConvertToArray(n);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if(sum%2 == 0){
            return true;
        }else {
            return false;
        }

    }


    static int[] intConvertToArray(int n) {

        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while (n != 0) {
            arr[len - j - 1] = n % 10;
            n = n / 10;
            j++;
        }
        return arr;


    }


    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
