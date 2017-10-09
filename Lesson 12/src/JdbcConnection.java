import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {// будет выполнять подключение к базе данных
    private static Connection conn;//
    public static  void init() throws ClassNotFoundException, SQLException {//создается подключение
        Class.forName("com.mysql.jdbc.Driver");//создает соединение со службой
        conn= DriverManager.getConnection("jdbc:mysql://localhost/orange_db","Artem","14785236");
    }
    public  static  Connection getConnetion(){//создает объект conn public (публичный)
        return conn;
    }
}
