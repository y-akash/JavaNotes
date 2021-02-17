public class Account {
    public static void deposit(float value) throws IOException{
        if (value <= 0)
            throw new IOException();
            // IOException is a checked exception and it should be handled at compile time 
            // so if we are throwing that exception than we have to use try catch block to handle them
            // if we write here try catch than it's no use of throw 
            // so we handle the exception from the caller of this method
            // that is from show method in the below class
            // but in unchcked exception we dont have to handle the exception 
            // bcoz that is runtimeException so it will throw on runtime
            // IllegalArgumentException is a runtime exception
            // in this situation we dont have to use that "throws" and "try catch" block
            throw new IllegalArgumentException();
    }
}


public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}