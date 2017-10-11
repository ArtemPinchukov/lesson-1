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
        Repository.playerId=result.getInt("id");
    }
    public  void  register(player p) throws SQLException {
        Connection con=JdbcConnection.getConnetion();
        PreparedStatement ps=con.prepareStatement("INSERT INTO players(login,pass_hash,age) Values(?,?,?)");
        ps.setString(1,p.login);
        ps.setString(2,p.pass_hash);
        ps.setInt(3,p.age);
        ps.executeUpdate();
        ResultSet result=ps.getGeneratedKeys();
        Repository.playerId=result.getInt(1);
    }
    private static int playerId;

}
