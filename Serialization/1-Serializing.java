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
            FileOutputStream fileOut = new FileOutputStream("location of file");    // where to store the object
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);   // How to store the object in that file 
            objectOut.writeObject(emp);
            objectOut.close();
            fileOut.close();
            System.out.println("Object is serialized  and saved in a  file ");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}