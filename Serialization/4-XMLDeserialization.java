class Main {
    public static void main(String[] args) {
        Employee emp = null;

        try {
            // FileInputStream fileIn = new FileInputStream("location of file");
            // BufferedInputStream bufferIn = new BufferedInputStream(fileIn);
            // XMLEncoder xencode = new XMLEncoder(bufferIn);
            XMLEncoder xencode = new XMLEncoder(new BufferedInputStream(new FileInputStream("Location of file")));
            emp = (Employee) xencode.readObject();            
            System.out.println("Deserializing Emploee");
            System.out.println("Name of employee: "+emp.name);
            System.out.println("Address of employee: "+emp.address);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}