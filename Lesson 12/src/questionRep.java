import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class questionRep {
    public ArrayList<question>getQuestions() throws SQLException {
        Connection con=JdbcConnection.getConnetion();
        PreparedStatement ps=con.prepareStatement("SELECT * FROM questions");//символ * выбирает все поля из таблицы
        ResultSet result=ps.executeQuery();
        ArrayList<question>questions=new ArrayList<>();
        while (result.next()){
            question q=new question();
            q.id=result.getInt("id");
            q.words=result.getString("words").split(";");//split - разделяет строку по заданному символу. в данном случае это точка с запятой
            q.answer =result.getString("answer");
            q.answer_img=result.getString("answer_img");
            questions.add(q);
        }
        return questions;
    }
}
