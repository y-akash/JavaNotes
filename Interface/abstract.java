// if we create an abstact class 
// so we can't create instance of that class
// we can only extend that class or create it's child class

// if we create abstract method inside abstract class
// and if any other class extend that abstract class
// than it needs to override that abstract method inside subclass
// oterwise it will give you error
// or we can make childclass to abstract
// so that it will not require to implement or override the abstract method

// GFG
    // An abstract class is a class that is declared with abstract keyword.
    // An abstract method is a method that is declared without an implementation.
    // An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    // A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
    // Any class that contains one or more abstract methods must also be declared with abstract keyword.
    // There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
    // An abstract class can have parametrized constructors and default constructor is always present in an abstract class.