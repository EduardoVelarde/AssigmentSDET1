import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**********************************************
         * ASSINGMENT 1
         **********************************************/
        int array[]={25,7,56,32,0};
        int arrayLong[]={12,23,342,343,56556,43,232,54,34,545,545,834,2348,65,8};

        //System.out.println("Please enter a year: ");
        //Scanner sc = new Scanner(System.in);
        //int year = sc.nextInt();
        //System.out.println("Factorial Value of 3: "+Assigments.factorial(9));
        //System.out.println("Printing Fibonacci: "+Assigments.printFibonacci(8));
        //System.out.println("Print Ascending of the next numbers: {25,7,56,32,0}");
        //Assigments.sortArray(array);
       // System.out.println("Is the entered year leap? answer: "+Assigments.isLeapYear(year));
        //printTenFirstNumbers(arrayLong);
        //calculatedTrinaguleArea();
        //calculatedSumofNaturalNumber();
        //sortArrayinDescentOrder();
        //printEvenNumbers();
        /**********************************************
         * ASSINGMENT 2
         **********************************************/
        //System.out.println("the value of this array: ");
        //Assigments.printArray(array);
        //System.out.println("and the Average is: "+Assigments.average(array));
        //System.out.println(". Find all the odd numbers from 79 to 187, result: "+Assigments.countEvenNumbers(79,187));
        //System.out.println("Is 13 a prime number? answer: "+Assigments.isPrime(13));
        //System.out.println("Find the sum of digits (1234;)  and sum is : "+Assigments.sumOfDigits(1234));
        //System.out.println("Reverse a number 123 , answer: "+Assigments.reverseNumber(123));
        //System.out.println("Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6");
        //System.out.println("Duplicates: "+Assigments.findDuplicates(new int[]{12, 32, 12, 45, 65, 93, 0, 23, 45, 6}));

        /********************************************
         * ASSINGMENT 3
         **********************************************/
        //System.out.println("Write a program to print the occurrence of each character in the String: DevLabs Alliance Training");
        //System.out.println(Assigments.countOcurrence("DevLabs Alliance Training"));
        //System.out.println("Write a program to check if a given string is a palindrome or not. example: 'trurt '");
        //System.out.println("answer: "+Assigments.isPalindrome("trurt"));
        //System.out.println("3. Write a program to check “brown” is present in the string: A brown fox ran away fast, anseer:  "+new String("A brown fox ran away fast").contains("brown"));
        //System.out.println("Write a program to throw NumberFormatException and handle it appropriately with a proper message.");
        //String str=null;
        //Assigments.exceptionHandler(str);
        //System.out.println("Write a program where a method declares that it throws ArithmeticException.");
        //Assigments.divisionByZero(23);
        //System.out.println("Write a program with nested try blocks");
        //Assigments.nestedTryCatch();
        //System.out.println("Write a program to re-throw an exception.");
        //Assigments.retryException();

        /********************************************
         * ASSINGMENT 4
         **********************************************/
        System.out.println("Find duplicate characters with their occurrences count using HashMap. (re used code done before)");
        System.out.println(Assigments.countOcurrence("DevLabs Alliance Training"));
        System.out.println("Reverse an Arraylist.");
        arrayList();
        System.out.println("Check if a particular key exists in HashMap");
        checkForKeyHashMap();
        System.out.println("Convert keys of a map to a list");
        convertMapToList();
        System.out.println("Copy all elements of a HashSet to an Object array");
        setToArray();
        System.out.println("Get highest and lowest value stored in TreeSet ");
        getHighestAndLowest();
        System.out.println("Sort ArrayList of Strings alphabetically.");
        sortNameAlphabetically();
        System.out.println("Get Set view of keys from HashTable. ");
        setViewKeysFromHashTable();


    }

    static void printTenFirstNumbers(int[] array){
        System.out.println("first String: ");
        Assigments.printArray(array);
        System.out.println("printing only the first 10 ");
        Assigments.printArray(Assigments.array(array));
    }
    static void calculatedTrinaguleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter base : ");
        int base = sc.nextInt();
        System.out.println("Please enter height : ");
        int height = sc.nextInt();
        int area = (base*height)/2;
        System.out.println("Area result: "+area);
    }
    static void calculatedSumofNaturalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num = sc.nextInt();
        System.out.println("The value of the sum is: "+Assigments.sumNaturalNumber(num));
    }
    static void sortArrayinDescentOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of lenght of the array: ");
        int j = sc.nextInt();
        int[] array = new int[j];
        for (int i=0; i< array.length;i++){
            System.out.println("Add the value to the array: ");
            int value = sc.nextInt();
            array[i]= value;
        }
        System.out.println("This is the array with entered values: ");
        Assigments.printArray(array);
        System.out.println("This the value of the array ofter using the sort by descending order: ");
        Assigments.sortArrayDescendent(array);
    }
    static void printEvenNumbers(){
        int[] array = new int[50];
        for(int i=0;i< array.length;i++){
            if (i==50)break;
            if(Assigments.evenOrOdd(i)){
                array[i]=i;
            }
        }
        Assigments.printArray(array);
    }

    static void arrayList(){
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
        arrayli.add(new Integer(1));
        arrayli.add(new Integer(2));
        arrayli.add(new Integer(3));
        arrayli.add(new Integer(4));
        System.out.println("Printing ArraysList without reverse: ");
        Assigments.printArrayList(arrayli);
        arrayli=Assigments.reverseArrayList(arrayli);
        System.out.println("Printing Reversed ArrayList: ");
        Assigments.printArrayList(arrayli);
    }
    static void checkForKeyHashMap(){
        HashMap<String, Integer> hashMap =
                new HashMap<>();

        // filling the key - value pairs in hashmap
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);
        System.out.println("It contains third?  answer :"+hashMap.containsKey("third"));
    }

    static void convertMapToList(){
        HashMap<String, Integer> hashMap =
                new HashMap<>();

        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);

        List<Integer> list = new ArrayList<Integer>(hashMap.values());
        List<String> list2 = new ArrayList<String>(hashMap.keySet());
        Assigments.printArrayList((ArrayList<Integer>) list);
    }
    static void setToArray(){
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(15);
        hs.add(71);
        hs.add(82);
        hs.add(89);
        hs.add(91);
        hs.add(93);
        hs.add(97);
        hs.add(99);
        System.out.println("printing elements of the set: "+hs);
        Object[] obArr = hs.toArray();
        for (Object ob : obArr)
            System.out.println(ob);

    }
    static void getHighestAndLowest(){
        TreeSet tSet = new TreeSet();
        // adding elements
        tSet.add(1);
        tSet.add(2);
        tSet.add(3);
        tSet.add(5);
        tSet.add(6);
        System.out.println("printing current values: "+tSet.toString());
        System.out.println("printing lowest value: "+tSet.first());
        System.out.println("printing highest value: "+tSet.last());
    }
    static void sortNameAlphabetically(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jose");
        names.add("sudhin");
        names.add("Antonio");
        names.add("Neethu");
        names.add("ananya");
        names.add("Athira");
        names.add("bala");
        names.add("Tony");
        names.add("Karthika");
        names.add("Nithin");
        names.add("Vinod");
        names.add("jeena");
        // ignoring case
        names.sort(String::compareToIgnoreCase);
        for(int i=0; i<names.size(); i++)
            System.out.println(names.get(i));
    }
    static void setViewKeysFromHashTable(){
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}
