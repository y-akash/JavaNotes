/*
JDBC => Java DataBase Connectivity
    JDBC is an application programming interface for the programming language Java, 
    which defines how a client may access a database. 
    It is a Java-based data access technology used for JDBC. 
    It is part of the Java Standard Edition platform, from Oracle Corporation.

To connect the application with Database we have to follow these 7 steps
    1 import the package
    2 (2a)load & (2b)register the Driver
    3 Establish the connection
    4 Create Statement
    5 Execute Query
    6 Process Result
    7 Close


JDBC Driver is a software component that enables java application to interact with the database. 
There are 4 types of JDBC drivers: 
    JDBC-ODBC bridge driver
    Native-API driver (partially java driver)
    Network Protocol driver (fully java driver)
    Thin driver (fully java driver)



Class.forName("ClassName") => to load the class
*/


import java.sql.*;  //1=> import the package

class Main {
    public static void main(String[] args) {

        Class.forName("com.mysql.jdbc.Driver"); //2b=> Register the Driver
        Connection con = DriverManager.getConnection("URL", "UserName", "Password");    //3=> Establish The Connection
        Statement st = con.CreateStatement();   //4=> Create Statement
        ResultSet rs = st.executeQuery("select * from student");    //5=> Execute Query
        //6=> Process Result        
        st.close();     //7=> Close
        con.close();    //7=> Close

    }
}    
// Connection, Statement, ResultSet are interface