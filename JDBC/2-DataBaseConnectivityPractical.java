import java.sql.*;

// to run this first we have to load the Driver after that we can register it
// so download mysql connector jar from mvn repository
// after download right click on project and go to build path and than configure build path
// than add jar file which you have downloaded it

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/DataBaseName";
        String uname = "userName";
        String password = "";
        String query = "select username from TableName";

        // **********Start From Here**********        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);
        Statment st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("username");

        System.out.println(name);

        st.close();
        con.close();
    }
}