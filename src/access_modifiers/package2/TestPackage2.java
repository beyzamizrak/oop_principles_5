package access_modifiers.package2;

import access_modifiers.package1.BMW;
import access_modifiers.package1.Honda;

public class TestPackage2 {
    public static void main(String[] args) {

        Honda h1 = new Honda();

        System.out.println(h1); // location

        // Tesla t1 = new Tesla(); can not be accessed as its default class


    }
}
