import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class gameForm extends JFrame{
    private JPanel gamePanel;
    private JTextField answerField;
    private JButton OKButton;
    private JButton loserButton;
    private JButton helpButton;
    private JPanel associationPanel;
    private JLabel hintButton;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public gameForm() throws SQLException {
        setContentPane(gamePanel);
        setBounds(200,10,800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        questionRep qr=new questionRep();
        Questions=qr.getQuestions();
        showNextQuestion();
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer=answerField.getText();
                String correctAnswer=currentQuestion.answer;
                if (answer.equalsIgnoreCase(correctAnswer)) {
                    JOptionPane.showMessageDialog(null, "Ты прав!", "WIN", JOptionPane.INFORMATION_MESSAGE);
                    score += tryCount + 2 * hintCount;
                    //TODO проверить последний ли это вопрос
                    showNextQuestion();
                }else {
                    tryCount--;
                    if (tryCount==0){
                        JOptionPane.showMessageDialog(null, "Вы проиграли! Правильный ответ:"+currentQuestion.answer, "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                        //TODO проверить последний ли это вопрос
                        showNextQuestion();
                    }else {
                        updateTryCountLableText();
                    }
                }

            }
        });


        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hintCount--;
                associationNumber++;
                String association = currentQuestion.words[associationNumber];
                addAssociation(association);
                if (hintCount == 0) {
                    helpButton.setEnabled(false);
                }else {
                    updateHintsButtonText();
                }
            }
        });
        loserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Вы проиграли! Правильный ответ:"+currentQuestion.answer, "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                //TODO проверить последний ли это вопрос
                showNextQuestion();
            }
        });
    }
    private int score=0;

    private ArrayList<question> Questions;

    private  void addAssociation(String association) {
        JLabel label=new JLabel(association);
        label.setBackground(Color.GREEN);
        label.setForeground(Color.ORANGE);
        associationPanel.add(label);
        associationPanel.updateUI();
    }

    private int questionNumber=0;

    private  question currentQuestion;

    private  int associationNumber;

    private int hintCount;

    private void showNextQuestion(){
        questionNumber++;
        currentQuestion=Questions.get(questionNumber-1);
        associationPanel.removeAll();
        associationNumber=0;
        addAssociation(currentQuestion.words[0]);
        helpButton.setEnabled(true);
        tryCount=7;
        hintCount=currentQuestion.words.length-1;
        updateHintsButtonText();
        updateTryCountLableText();
    }
    private void updateHintsButtonText(){
        String s=String.format("Подсказка(%d)",hintCount);
        helpButton.setText(s);
    }
    private  int tryCount;
    private  void updateTryCountLableText(){
        String s =String.format("У вас остлось (%d) попыток",tryCount);
        hintButton.setText(s);
    }


}
