/*
Hierarchy of Exception
                    Throwable

            (checked)
            Exception       Error

        (unchecked)
    RuntimeException
    -----OR-----
Object
    Throwable
        Exception
            RuntimeException
*/

public class ExceptionDemo{
    public static void show() {
        try{
            var reader = new FileReader("file.txt");
            new SimpleDateFormat().parse("");
        }// with the help of ' | ' we can catch more than one exception in one catch block.
        catch (IOException | ParseException e) {
            System.out.println("Error Occur");
        }
    }
}