package oopPractice;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nSword1 is created after this line\n");

        Sword sword1 = new Sword(); // -> default constructor

        System.out.println("\nSword2 is created after this line\n");
        Sword sword2 = new Sword("This is a sword"); // -> Modified constructor

        System.out.println("\nSword3 is created after this line\n");
        Sword sword3 = new Sword("This is a sword"); // -> Modified constructor


    }


}
