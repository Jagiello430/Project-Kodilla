package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.INSTANCE;
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.INSTANCE;
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + ", " +
                    resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LastName"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(6,counter);
    }
    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.INSTANCE;
        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1,counter);
    }
}
