package class_object;

public class Apple {

    // default constructor is provided by java to create zero arg object

    public Apple() {
        // each time u create a new object this block will be executed

        System.out.println("This is the default constructor");

    }
        // instance variables - fields- states- attributes

        public String color; // null
        public double price; // 0.0
        public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
