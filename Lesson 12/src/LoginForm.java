import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LoginForm extends JFrame{
    private JTextField loginTextField;
    private JPanel panel1;
    private JButton enterButton;
    private JTextField Password;
    private JButton registrationButton;

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
                    return;
                }
                gameForm gf=new gameForm();
                gf.setVisible(true);
                setVisible(false);
            }
        });
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                try {
                    RegistrationForm rf=new RegistrationForm();
                    rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    rf.setVisible(true);
                    rf.setBounds(550,100,500,400);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }
}
