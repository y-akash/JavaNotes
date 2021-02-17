// What interface are
/*  An Interface is a type similar to class but it only includes method declaration, No implementation 
    or it has no code only specifies what capabilities interface should have.
    after java 8 and 9 we can decalre variable in an interface but they will public static and final
    interface => What should be done
    class => How it should be done

    and Interface can have multiple parents
    or it can extends multiple interface
*/

public interface Abc {
    // "public" is not neccessary or redundant bcoz the method has to be implemented
    // by a class
    // and this method should be public there
    // its like public property
    void basicMethod();
}

public class Xyz implements Abc {
    // interface said that if a class that implements interface
    // than the child class should have public method with exact method name
    // it should be public
    @override
    public void basicMethod() {
        // write code here
    }
}

class Main {
    public static void main(String[] args) {

    }
}

// Why we need them
// How to use them properly
// Dependency Injection
// constructor injection
// setter injection
// method injection