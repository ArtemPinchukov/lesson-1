import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Record {
    public String name;
    public int score;
    public String time;
    @Override public String toString(){
        String s=String.format("[%s] %s: %d\n",time,name,score);
        return  s;
    }
}
