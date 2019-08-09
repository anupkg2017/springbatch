package com.ashish.spring.batch.step;

import java.sql.*;
import java.sql.*;

/**
 * Created by agopalakrishnan on 8/12/17.
 */
public class ConnectionUtil
{

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";

    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials
    static final String USER = "sa";

    static final String PASS = "";

    public static Connection connect()
    {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch (Exception e)
        {

        }
        return conn;
    }

}
