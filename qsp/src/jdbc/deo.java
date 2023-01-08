package jdbc;
import java.sql.*;

public class deo {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:demo.db");
            Statement stm=c.createStatement();
            
            stm.execute("create table demo(no int ,name text,sal float)");
            String s="insert into demo values(3,"+"asf"+",3.4)";
            stm.execute(s);
            ResultSet r=stm.executeQuery("select * from demo");
            while (r.next()) {
                System.out.println(r.getInt(0));
                System.out.println(r.getString(1));
                System.out.println(r.getFloat(2));
            }
            r.close();
            stm.close();
            c.close();

        } catch (Exception e) {
            System.out.println("not connected");
        }
    }
}
