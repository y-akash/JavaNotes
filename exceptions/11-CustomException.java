// checked ->   Exception
// unchecked (RunTime)-> RunTimeException


public class CustomException extends RunTimeException{
    public CustomException(){
        // send a custom message to parent constructor we extendig it.
        super("Insuficient Funds");
    }
}

public class Account {
    private float balance;

    public void withdraw(float value) throws CustomException{
        if (value > balance)
            throw new CustomException();
    }
}

public class ExceptionsDemo {
    public static void show(){
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
    }
}