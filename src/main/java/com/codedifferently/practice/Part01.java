package com.codedifferently.practice;

public class Part01 {


    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public  String concatenate(String string1, String string2) {
        return string1 + string2;
    }





    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        for ( int i= 0; i < string1.length(); i--){

            string1.charAt(i);
            System.out.println(string1.charAt(i));
        }


        return string1;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public  String removeCharacters(String string, String charactersToRemove) {
        return null;
    }

    public static void main(String[] args) {

        Part01.reverse("myke");
    }
}
