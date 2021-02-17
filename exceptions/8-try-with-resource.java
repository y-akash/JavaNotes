public class ExceptionDemo{
    public static void show() {
        // we can initialize or write external resources with try statment
        // so using this way we dont have to close explicityly this resource
        // java compiler do that for us
        // to work this way the FileReader or other class should implement AutoClosable interface
        // and we can create multiple object here
        try ( var reader = new FileReader("file.txt") ){
            new SimpleDateFormat().parse("");
        }
        catch (IOException e) {
            System.out.println("Error Occur");
        }
    }
}


// and we can also create multiple object
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("someFile.txt");
            )
        {
            new SimpleDateFormat().parse("");
        }catch (IOException e) {
            System.out.println("Error Occur");
        }