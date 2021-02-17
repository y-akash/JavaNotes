// 'T' is a type parameter for GenericList class
// when we create instance of GenericList class 
// than we have to specify the argumet for the value of this parameter see in main class
public class GenericList<T> {
    private T[] items = (T[]) new Object();
    private int coount;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

}

public class Main {
    public static void main(String[] args) {
        // here we specify the type of object we want to store into the list
        // in the place of Integer
        // var list = new GenericList<Integer>(); 
        // list.add(1);
        // int item = list.get(0);
        // ---------------OR---------------
        var list = new GenericList<User>(); 
        list.add(new User("Akash"));
        User item = list.get(0);
    }

}}

// we can also create generic Method inside no generic class
