public class Account {
    public static void deposit(float value) throws IOException{
        if (value <= 0)
            throw new IOException();     
    }
}

public class ExceptionsDemo {
    public static void show() throws IOException{
        var account = new Account();
        try {
            account.deposit(1);
        } catch (IOException e) {
            // here we are getting the exception from Account class
            // again we are throwing this exception 
            // so this is called re-throwing exception
            // this exception need to be handle by the caller of this method
            // which is present in a Main class
            throw e;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionDemo.show();    
        } catch (Exception e) {
            System.out.println("An Unexpected error occurred.");
        }
        
    }
}