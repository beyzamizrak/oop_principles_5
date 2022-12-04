package class_object;

public class Fruit {

    public Fruit (){

    }

    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;
//
    {
        isSweet = true;
        System.out.println("This is an instance block");
    }
// Static block is executed only once and before everything else in the same class
    static {
        hasColor = true;
        System.out.println("This is a static block");
    }






}
