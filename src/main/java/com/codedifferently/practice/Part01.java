package com.codedifferently.practice;

public class Part01 {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public String concatenate(String string1, String string2) {
        String result = string1.concat(string2);
        return result;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public String reverse(String string1) {
       String reverseString1="";
        char ch;


        for (int i=0; i<string1.length(); i++)
        {
            ch= string1.charAt(i); //extracts each character
            reverseString1= ch+reverseString1; //adds each character in front of the existing string
        }
        return reverseString1;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public  String removeCharacters(String string, String charactersToRemove) {
        String strNew = string.replaceAll(charactersToRemove, "");
        return strNew;
    }


}
