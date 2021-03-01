import java.sql.*;

class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/DataBaseName";
        String uname = "userName";
        String password = "";
        int userid = 6;
        String username = "Akash";
        String query = "insert into TableName values(?,?)";
   
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,userid);    // setInt(questionMarkNumber, value)
        st.setString(2, username);  // setString(questionMarkNumber, value)
        int count = st.executeUpdate();

        System.out.println(count);

        st.close();
        con.close();
    }
}