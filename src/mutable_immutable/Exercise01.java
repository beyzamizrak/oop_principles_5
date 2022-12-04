package mutable_immutable;

public class Exercise01 {

    /*
    Create a method that takes a String and returns a string
    if the given string have even length and length is at least 2, then insert * in the middle of the String
    a*a
    ja*va
    Yoa*nna
    if the given string have an odd length is at least 3 , then insert * in before and after the middle character
    a*a*a
    ol*e*na Olena
    if the string is empty or having lennth of 1 then return the string back
     */

    public static String insertStar(String str){
        StringBuilder newStr = new StringBuilder(str);

        if (str.length() <= 1 ) return str;
        if (str.length() % 2 == 0) return newStr.insert(newStr.length()/2, '*').toString();
        else return newStr.insert(newStr.length()/2, '*').insert(newStr.length()/2 + 1, '*').toString();

    }

    public static void main(String[] args) {
        System.out.println(insertStar("a"));
        System.out.println(insertStar("aa"));
        System.out.println(insertStar("aaa"));
        System.out.println(insertStar("aaaa"));
        System.out.println(insertStar("aaaaa"));
        System.out.println(insertStar("aaaaaa"));
    }
}
