package oopPractice;

public class Sword {


    // static code block
    // running only once before everything else

    static {
        System.out.println("Starting the sword making furnace");
    }

    // non-static code block
    // running everytime when you create object before everything after static
    {

        System.out.println("heating up the furnace");
    }

    // 1. Constructor
    // Default Constructor
    public Sword(){

    }


    // Modified Constructor
    public Sword(String text){
        System.out.println(text);
    }

    public Sword(double weight, double length, String name, String material){
        this.weight = weight; //  assign the value of local variable in the instance variable
        this.length = length;
        this.name = name;
        this.material = material;
    }


    // 2. Instance variables

    //  static ones -> belongs to the class. What does every sword has?

    public static boolean hasHandle = true;
    public static boolean isSharp;

    // non-static ones -> belongs to the object What is changing sword by sword?

    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Methods -> What does a sword do
    //  static ones -> belongs to the class. What does every sword has?

    public static void slash(){
        System.out.println("Sword is slashing");
    }

    // non-static ones -> belongs to the object What is changing sword by sword?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 10 pounds * 15 inches = 150 points

    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points");
    }







}
