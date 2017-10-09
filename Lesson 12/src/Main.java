import javax.swing.*;
import java.sql.SQLException;

public class Main{
public static void main(String[]args) throws SQLException, ClassNotFoundException {
    LoginForm lf =new LoginForm();
    lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lf.setVisible(true);
    lf.setBounds(550,100,300,400);//задает координаты резмещения окна и его размеры
}
}
