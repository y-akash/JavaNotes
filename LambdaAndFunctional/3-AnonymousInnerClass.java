// sometimes we dont want to create a class and implement an interface
// bcoz may be that only be use only once so it's no use to create a class
// to solve that we can create an Anonymous inner class

// below the inteface has given 
// so here we will not create a class which implement an interface
public interface FunctionalInterface {
    // abstract method
    void print(String message);

    // default method
    default void printTwice(String message) {
        System.out.println(message);
        System.out.println(message);
    }
}

public class DemoClass {
    public static void show() {
        // *****************************************************************************
        // the below is an Anonymous inner class
        // Anonymous => bcoz it does not have a name
        // Inner => bcoz it is use in a method
        // in java 8 introduces better approach called lambda expression
        greet(new FunctionalInterface() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(FunctionalInterface printer) {
        printer.print("Hello World");
    }
}

public class Main {
    public static void main(String[] args) {
        DemoClass.show();
    }
}
