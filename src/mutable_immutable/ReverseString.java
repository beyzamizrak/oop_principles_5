package mutable_immutable;

public class ReverseString {


    public static String reverseString(String str){

       /* String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
        */

        StringBuilder result = new StringBuilder(str);

        result.reverse();

        return result.toString();

        //return new StringBuilder(str).reverse().toString();

    }

    public static boolean isPalindrome( String str){

        return str.equals(new StringBuilder(str).reverse().toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("hello"));
    }



}
