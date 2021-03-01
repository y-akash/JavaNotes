class Main {
    public static void main(String[] args) {
        Employee emp = null;

        try {
            FileInputStream fileIn = new FileInputStream("location of file");    // where to fetch the object
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);   // How to fetch the object from that file 
            emp = (Employee) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Deserializing Emploee");
            System.out.println("Name of employee: "+emp.name);
            System.out.println("Address of employee: "+emp.address);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}