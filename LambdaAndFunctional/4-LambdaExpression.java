// Lambda Expression or Anonymous Function syntax
// similar to arrow method in javascript
// we can also store this lambda expression in a variable
/*
    (parameters) -> {}
*/

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
        // LAMBDA EXPRESSION
        // parameters are without type bcoz java handle this underhood
        greet((message) -> {
            System.out.println(message);
        });

        // **********OR**********
        FunctionalInterface lambdaExpressionVariable = (message) -> {
            System.out.println(message);
        }

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
