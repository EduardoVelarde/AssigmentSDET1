import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Assigments {

    public static int factorial(int num) {
        int iteration = num;
        int factorialResult = 1;
        while (iteration != 0) {
            factorialResult = factorialResult * iteration;
            iteration -= 1;
        }
        return factorialResult;
    }

    public static String printFibonacci(int num) {
        int num1 = 0, num2 = 1, num3;
        String serie = 0 + " " + 2;

        for (int i = 2; i < num; ++i) {
            num3 = num1 + num2;
            serie += "," + num3;
            num1 = num2;
            num2 = num3;
        }
        return serie;
    }

    public static void printArray(int[] array) {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] array) {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int temporary = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        printArray(array);

    }
    public static void sortArrayDescendent(int[] array) {
        int temporary = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        printArray(array);

    }
    public static boolean evenOrOdd(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isLeapYear(int year) {
        // year to be checked

        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        } else
            leap = false;
        return leap;

    }

    public static int[] array(int[] array) {
        int[] newArray = new int[9];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int sumNaturalNumber(int num) {
        int i, sum = 0;

        for (i = 1; i <= num; ++i) {
            sum = sum + i;
        }
    return sum;
    }

    public static float average(int[] array){
        int sum=0;
        float average;

        for(int i=0;i<array.length;i++){
            sum= sum + array[i];
        }
        average=sum/array.length;

        return average;
    }

    public static int countEvenNumbers(int minLimit,int maxLimit){
        int counter =0;
        for (int i =0; minLimit<=maxLimit;minLimit++){
            if(evenOrOdd(minLimit)){

            }else counter++;

        }
        return counter;
    }
    public static boolean isPrime(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
    return !flag;
    }

    public static int sumOfDigits(int num){
        int size = Integer.toString(num).length();
        int sum =0;
        for(int i=0;i<size;i++){
            String number = String.valueOf(Integer.toString(num).charAt(i));
            sum+=Integer.parseInt(number);
        }
        return sum;
    }

    public static int reverseNumber(int num){
        int size = Integer.toString(num).length();
        String numbers="";
        int reversedNum =0;
        for(int i=size-1;i>=0;i--){
            String number = String.valueOf(Integer.toString(num).charAt(i));
            numbers=numbers+number;
        }
        reversedNum=Integer.parseInt(numbers);

        return reversedNum;
    }
    public static String findDuplicates(int[] array){
        String[] str = convertToStringArray(array);
        System.out.println("printing values");
        printArray(str);
        String duplicates="";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1 ; j < str.length; j++) {
                if (str[i].equals(str[j])) {
            //duplicates elements
                    duplicates=duplicates+","+str[i];
                }
            }
        }



        return duplicates;
    }
    public static String[] convertToStringArray(int[] array){
        int size = array.length;
        String numbers="";
        String[] numbersStr= new String[size];
        for(int i=0;i<size;i++){
            String number = String.valueOf(Integer.toString(array[i]));
            numbersStr[i]=number;
        }
        return numbersStr;
    }

    public static HashMap countOcurrence(String str){

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            if(charCount.containsKey(str.charAt(i)))
            {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else
            {
                charCount.put(str.charAt(i),1);
            }
        }
        return charCount;
    }

    public static boolean isPalindrome(String str)
    {
        String rev = "";

        boolean result = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            result = true;
        }
        return result;
    }
    public static int exceptionHandler(String str) {
        try{
            int num = Integer.parseInt(str);
            return num;
        }catch (NumberFormatException nfe){
            System.out.println("Invalid input string");
            return 0;
        }
    }

    public static int divisionByZero(int a){
        int b=0;
        int x=50;
        try{
            int division;
            double c = divideAndSquare(x, b);
            System.out.println(c);
            return 0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage()+" Invalid arimatic operation");
            return 0;
        }
    }

    static double divideAndSquare(int x, int y) {
        double z = x / y;
        return z * z;
    }

    public static void nestedTryCatch(){
        try{
            System.out.println("firts try catch");
            try {
                System.out.println("Second try catch");
            }catch(RuntimeException e){

            }
        }catch(RuntimeException e){

        }
    }

    public static void retryException(){
        try{

            System.out.println("firts try catch");
            try {
                throw new RuntimeException("First Exception");
            }catch(RuntimeException e){
                System.out.println("error in the last try");
            }
        }catch(RuntimeException e){
            System.out.println("error in the first try");
        }
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {

            revArrayList.add(alist.get(i));
        }
        return revArrayList;
    }
    public static void printArrayList(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}
