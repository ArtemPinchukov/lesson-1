import sun.security.util.Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class RegistrationForm  extends JFrame {
    private JTextField loginTextField;
    private JTextField Password;
    private JPanel Panel2;
    private JButton registrationButton;
    private JTextField repeatPasswordField;
    private JTextField ageField;

    public RegistrationForm() throws SQLException, ClassNotFoundException {
        setContentPane(Panel2);

        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password= Password.getText();
                String repeatPassword= repeatPasswordField.getText();
                if(loginTextField.getText().length()==0||Password.getText().length()==0) {
                    JOptionPane.showMessageDialog(null, "Все поля должны быть заполнены", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (password.equals(repeatPassword)==false){
                    JOptionPane.showMessageDialog(null,"Пароли должны совпадать","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String ageString =ageField.getText();
                int age;
                try{
                    age=Integer.parseInt(ageString);
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null,"Возраст указан неверно","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(age <4||age >99){
                    JOptionPane.showMessageDialog(null,"Ваш возраст не соответсвует требованиям","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                player p=new player();
                p.login=loginTextField.getText();
                p.pass_hash=password;
                p.age=age;
                Repository rep=new Repository();
                try{
                    rep.register(p);
                }
                catch (SQLIntegrityConstraintViolationException e1)
                {
                    JOptionPane.showMessageDialog(null,"Пользователь с таким логином уже существует","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                catch (SQLException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Ошибка регистрации","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                } ;
                gameForm gf= null;
                try {
                    gf = new gameForm();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                gf.setVisible(true);
                setVisible(false);
            }
        });
    }
}