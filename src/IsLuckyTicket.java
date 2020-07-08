public class IsLuckyTicket {

    public static void main(String[] args) {


        int number = 999999;

        System.out.println(isLucky(number));


    }//end main


    // 12 - 30 - true
    static boolean isLucky(int n) {


        boolean bl = false;

        String str = String.valueOf(n);


        if (str.length() > 2) {
            //first numbers
            int firstNumber = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                firstNumber += Integer.parseInt(String.valueOf(str.charAt(i)));
            }//


            //seconds numbers
            int secondNumbers = 0;
            for (int i = str.length() / 2; i < str.length(); i++) {
                secondNumbers += Integer.parseInt(String.valueOf(str.charAt(i)));
            }//

            if (firstNumber == secondNumbers) {
                bl = true;
            }


        } else {

            int firstNumber = n % 10;
            int secondNumber = n / 10;

            if (firstNumber == secondNumber) {
                bl = true;
            }


        }

        return bl;
    }


}//end Class
