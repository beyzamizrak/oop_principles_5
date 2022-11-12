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

        System.out.println("\n=============task==============\n");

        int count = 0;
        for (Apple myApple : myApples) {
            if(myApple.taste.equals("sweet")) count++;

        }
        System.out.println(count);


    }
}
