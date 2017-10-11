import javax.swing.*;

public class gameForm extends JFrame{
    private JPanel gamePanel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public gameForm(){
        setContentPane(gamePanel);
        setBounds(200,10,800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
