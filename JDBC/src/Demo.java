import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        String sql="select name,email,gender from users where id=15";
        String url="jdbc:mysql://localhost:3306/startersql";
        String username="kartikey_user";
        String password= "root";
        Connection con= DriverManager.getConnection(url, username,password);
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}
