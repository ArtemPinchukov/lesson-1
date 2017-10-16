import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class RecordForm extends JFrame {
    private JTextArea recordsField;
    private JPanel panel1;

    public  RecordForm() throws SQLException {
        setContentPane(panel1);
        setLocation(100,100);
        setSize(300,400);
        RecordsRep rr=new RecordsRep();
        ArrayList<Record>records=rr.getRecord();
        for (Record record:records){
            recordsField.setText(recordsField.getText()+record);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
