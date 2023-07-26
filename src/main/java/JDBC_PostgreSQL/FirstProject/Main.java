package JDBC_PostgreSQL.FirstProject;
import org.postgresql.Driver;

import java.sql.*;
public class Main {
    public int  i = 0;
    public static void main(String[] args) {
        Class<Driver> driverClass = Driver.class;
        String pass = "pass";
        String UserName = "postgres";
        String URL = "jdbc:postgresql://localhost:5432/new_data_base";
        try (Connection connection = DriverManager.getConnection(URL, UserName, pass);
             Statement statement = connection.createStatement()){
            System.out.println(connection.getTransactionIsolation());
            System.out.println("-------------------------------------------");
            ResultSet resultSet = statement.executeQuery("select * from table2 inner " +
                    "join newtable on table2.table_id = newtable.table_id");
            while (resultSet.next()){
                System.out.print(resultSet.getString(4));
                System.out.print("   ");
                System.out.println(resultSet.getString( 2));

            }
            /*
            Result:

            Vadim       python
            Egor        Java
            Pasha       C++
            Sasha       Go
            Ania        python
            Catia       C#
            Masha       Java
            Larisa      python
            */

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
