import java.util.Collection;
import java.util.Arrays;
// Different ways to Creating a Stream
//     From Collections
//     From Arrays
//     From an Arbitrary number of Objects
//     we can generate infinite/finite number of Stream

// FROM COLLECTIONS
// every class that implements collection interface that have a Stream method or 
// have an ability to return a stream
public class CreatingStreamsDemo {
    public static void show() {
        Collection<Integer> x;
        x.stream().filter(predicate);
    }
}

// FROM ARRAYS
// arrays dont have a stream method
// but we have a Arrays class that have static method called stream
public class CreatingStreamsDemo {
    public static void show() {
        int[] numbers = { 1, 2, 3 };
        Arrays.stream(numbers); // this line return a stream
        // OR
        int[] newArray = Arrays.stream(numbers).filter(number -> number > 2);
    }
}
