package class_object;

import java.util.Arrays;

public class Apple_Exercise {
    public static void main(String[] args) {
        /*
        create three apple objects with below info
        apple1 : red, 0.5 sweet
        apple2: yellow, 0.75, sweet
        apple3: green, 1.0, sour

         */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "sweet";

        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "sweet";

        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        // count how many apple objects are sweet
        //expected : 2

        System.out.println("\n==============apple array===============\n");
        Apple[] myApples = {apple1, apple2, apple3};

        System.out.println(Arrays.toString(myApples));
        System.out.println(myApples.length);
        System.out.println(myApples[1]);
        System.out.println(myApples[2].taste);

        System.out.println("\n=============task1==============\n");

        int count = 0;
        for (Apple myApple : myApples) {
            if(myApple.taste.equals("sweet")) count++;

        }
        System.out.println(count);

        System.out.println("\n=============task2==============\n");

        //

        /*Apple a1 = new Apple("Yellow", 0.5, "Sour");
        Apple a2 = new Apple("Red", 0.75, "Sour");
        Apple a3 = new Apple("Green", 0.5, "Sour");
        Apple a4 = new Apple("Yellow", 1.0, "Sweet");
        Apple a5 = new Apple("Yellow", 1.5, "Sweet");

        Apple[] arr = {a1, a2, a3, a4, a5};

        for (Apple apple : arr) {
            System.out.println(apple);
        }

         */

        Apple[] arr = {
                new Apple("Yellow", 0.5, "Sour"),
                new Apple("Red", 0.75, "Sour"),
                new Apple("Green", 0.5, "Sour"),
                new Apple("Yellow", 1.0, "Sweet"),
                new Apple("Yellow", 1.5, "Sweet")
        };

        System.out.println(arr[2]);
        for (Apple apple : arr) {
            System.out.println(apple);
        }

        System.out.println("\n=====get each infor dor each apple object and print it =======\n");

        /*
        Yellow
        0.5
        Sour
         */

        for (Apple apple : arr) {
            System.out.println(apple.color);
            System.out.println(apple.price);
            System.out.println(apple.taste);
        }









    }
}
