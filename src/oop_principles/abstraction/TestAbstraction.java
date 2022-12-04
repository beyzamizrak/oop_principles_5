package oop_principles.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();

       iPhone i1 = new iPhone();
       i1.call();
       i1.text();

       Samsung s2 = new Samsung(64, "GalaxyS20", "Black", 700);
       iPhone i2 = new iPhone(128, "iPhone 14 Max Pro", "Silver", 750.50);

        System.out.println(s2);
        System.out.println(i2);

        s2.takesPhoto();
        s2.recordVideo();
        i2.takesPhoto();
        i2.recordVideo();

        Nokia n1 = new Nokia();
        



    }
}
