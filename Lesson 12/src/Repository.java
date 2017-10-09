import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository {
    public  void login(String login,String password) throws Exception {
        Connection con=JdbcConnection.getConnetion();
        PreparedStatement ps=con.prepareStatement("SELECT id FROM players WHERE login=? AND pass_hash=?");
        ps.setString(1,login);
        ps.setString(2,password);
        ResultSet result=ps.executeQuery();
        if (result.next()==false){
            throw new Exception("Не верный логин или пароль");
        }
    }
}
