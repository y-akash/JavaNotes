public class ExceptionDemo{
    public static void show() {
        // bocz if we assign it in try block than it will not accessible to finally block
        // so we are declaring here
        FileReader reader = null;
        try{
            reader = new FileReader("file.txt");
            var value = new re
        }catch (IOException e) {
            System.out.println("Error Occur");
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}