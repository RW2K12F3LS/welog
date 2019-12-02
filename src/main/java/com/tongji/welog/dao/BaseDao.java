package com.tongji.welog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@100.68.231.172:1521:orcl";
    static final String USER = "chend";
    static final String PASS = "root";

    Connection getConn()  {
        try {
            Connection conn = null;
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database.");
            return conn;
        } catch (Exception e) {
            System.out.println("Database Connection Problem~~~");
            e.printStackTrace();
            return null;
        }
    }
}
