public class AlternatingSums {

    public static void main(String[] args) {


    }


    //[50, 60, 60, 45, 70]
    // [180, 105]

    static int[] alternatingSums(int[] a) {

        int firstTeam = 0;
        int secTeam = 0;


        if (a.length == 1) {
            firstTeam = a[0];
        } else {
            firstTeam = a[0];
            for (int i = 1; i < a.length; i++) {
                if (i % 2 == 1) {
                    secTeam = secTeam + a[i];
                } else {
                    firstTeam = firstTeam + a[i];
                }

            }
        }


        int[] arrayTest = new int[2];
        arrayTest[0] = firstTeam;
        arrayTest[1] = secTeam;
        return arrayTest;


    }

}
