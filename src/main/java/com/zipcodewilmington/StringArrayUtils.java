package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i <= array.length-1; i++){
            if (array[i].equals(value)){
                return true;
            }
        }return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] rev = new String[array.length];
        for (int i = 0; i < array.length; i++){
            rev[(array.length -1) - i] = array[i];
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(array[array.length-1 - i])){
                return true;
            }
        }return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = true;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String a = Arrays.toString(array).toLowerCase();
        String[] alphaArray = alpha.split(""); //split string alpha into string array
        for (int i = 0; i < alpha.length() - 1; i++) {
            if (!a.contains(alphaArray[i])) {
                result = false;

            } else
            {
                result = true;
            }
        } return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for(int i = 0; i< array.length; i++){
            if (array[i]==value){
                occurrences += 1;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String remainder = "";
        for (int i = 0; i < array.length; i++){
            if (!array[i].equals(valueToRemove)){
                remainder += array[i] + " ";
            }
        }
        String[] leftover = remainder.split(" ");
        return leftover;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = 0;
        String[] a = array;

        for (int i = 0; i < array.length-1; i++){
            if(a[i] == a[i+1]){
                count++;}

        }
        System.out.println(count);
        String[] dupChars = new String[a.length-count];
        // Temp string to store duplicate characters
        String tempString = a[0];
        // Current position for dupChars array
        int position = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i+1]) {
                dupChars[position] = tempString;
                tempString = a[i+1];
                position++;
            } else {
                tempString = a[i];
            }
        }
        dupChars[position] = a[a.length-1];
        for (int i = 0; i < dupChars.length; i++) {
            System.out.println(dupChars[i]);
        }
        return dupChars;


    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 1;
        String[] a = array;

        for (int i = 0; i < array.length-1; i++){
            if(a[i] != a[i+1]) count++;
        }

        String[] dupChars = new String[count];

        // Temp string to store duplicate characters
        String tempString = a[0];
        // Current position for dupChars array
        int position = 0;
        for (int i = 0; i < a.length; i++) {

            if(i == a.length-1) dupChars[position] = tempString;
            else {
                if (a[i] != a[i + 1]) {
                    dupChars[position] = tempString;
                    tempString = a[i + 1];
                    position++;
                } else {
                    tempString += a[i + 1];
                }
            }
        }

//        for (int i = 0; i < dupChars.length; i++){
//            System.out.println(dupChars[i]);
//        }
        // for checking every array
        return dupChars;

    }


}
