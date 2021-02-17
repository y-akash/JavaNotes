// EXAMPLE 1
// if Interface has only one abstract method 
// than such interface is called functional interface
// if it has more than one abstract method than it will not called functional interface
public interface FunctionalInterface {
    // abstract method
    void print(String message);
}

// EXAMPLE 2
// java has introduce a default method concept in an interface
// which can have implementation
// so below interface still called functional interface
// bcoz it has only one abstract mehthod and
// it does not care about default method
public interface FunctionalInterface {
    // abstract method
    void print(String message);

    // default method
    default void printTwice(String message) {
        System.out.println(message);
        System.out.println(message);
    }
}
