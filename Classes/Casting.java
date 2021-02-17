
// UpCasting - casting an object to it's super class
// DownCasting - casting an object to it's sub class

public class ParentClass {
    public void p1() {
        System.out.println("Insdi Parent class");
    }
}

public class SubClass extends ParentClass {
    public void s1() {
        System.out.println("Inside Subclass");
    }

    // @Override
    // public void p1() {
    // System.out.println("inside sub class overrriding");
    // }
}

class Casting {
    public static void main(String[] args) {
        System.out.println("Hello World");
        var sub = new SubClass();
        ParentClass ppp = new ParentClass();
        ParentClass par = sub; // Here we are doing upcasting
        // now if we try to access methods using 'par' object than it will show us only
        // parent class method
        // but if we print this object than it will give object of subclass
        // if we override method in subclass and than we access the method than it will
        // give us subclass method
        par.p1();
        System.out.println(sub); // SubClass@2f92e0f4
        System.out.println(ppp); // ParentClass@28a418fc
        System.out.println(par); // SubClass@2f92e0f4
    }
}