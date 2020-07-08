import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStringFinderJavaCode {

    public static void main(String[] args){

        String[] testStringArray = {"aba", "aa", "ad", "vcd", "aba"};


        System.out.println( Arrays.toString(allLongestString(testStringArray)));

       // findLogestString(testStringArray);



    }

    //"aba",
    // "aa",
    // "ad",
    // "vcd",
    // "aba"]
    static String[] allLongestString(String[] inputArray){

        int logestString = inputArray[0].length();

        //work
        for (int i = 0; i < inputArray.length; i++) {
            if(logestString < inputArray[i].length()){
                logestString = inputArray[i].length();
            }
        }//

        //create list for put all longest string after cope other string array
        List list = new ArrayList();
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() == logestString){
                list.add(inputArray[i]);
                count++;
            }
        }

        String[] newArrayString = new String[count];
        for (int i = 0; i < list.size(); i++) {
            newArrayString[i] = (String) list.get(i);
        }


        return newArrayString;



    }


    static void findLogestString(String[] inputArray){
        int logestString = inputArray[0].length();

        for (int i = 0; i < inputArray.length; i++) {
            if(logestString < inputArray[i].length()){
                logestString = inputArray[i].length();
            }
        }
        System.out.println(Integer.toString(logestString));
    }

}
