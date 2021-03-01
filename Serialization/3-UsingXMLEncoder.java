import java.io.Serializable;
class Employee implements Serializable {
    public String name;
    public String address;
}

// **********NEW FILE**********
class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Akash";
        emp.address = "Mumbai";

        try {
            // FileOutputStream fileOut = new FileOutputStream("location of file");
            // BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
            // XMLEncoder xencode = new XMLEncoder(bufferOut);
            // instead of writting above code we can write in one line so we can only need to close one nencode object
            XMLEncoder xencode = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Location of file")));
            xencode.writeObject(emp);
            xencode.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}