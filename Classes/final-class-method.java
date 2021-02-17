// if we assign final to the class
// than we cannot extend that class or we cannot create it's child class

class final Parent{
    Parent(){
        System.out.println("Inside Parent class");
    }
}

// here it will give us error 
// bcoz Parent class are assigned as a final
// so we cant extend final class
class Child extends Parent{
    Child(){
        System.out.println("Inside Child class");        
    }
}

class Main{
    public public static void main(String args[]) {
        var parent = new Parent();
        var child = new Child();
    }
}


// if we assign final to the method
// than we cannot override that method