import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginForm extends JFrame{
    private JTextField loginTextField;
    private JPanel panel1;
    private JButton enterButton;
    private JTextField Password;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public LoginForm() throws SQLException, ClassNotFoundException {
        JdbcConnection.init();

        setContentPane(panel1);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,"какой-то текст","Title",JOptionPane.WARNING_MESSAGE); //выыскакивает диалоговое окно
                String login=loginTextField.getText();
                String password=Password.getText();
                try {
                    Repository pRep = new Repository();
                    pRep.login(login, password);
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
