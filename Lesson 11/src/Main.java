import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно");
        frame.setSize(300, 400);// размеры окна
        frame.setLocation(100, 100);//положение окна при запуске относительно верхнего левого угла экрана
        frame.setVisible(true);//делает окно видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//останавливает работу программы призакрытии созданного окна
        /*JButton button=new JButton("OK");
        button.setSize(15,15);
        button.setLocation(10,10);
        frame.add(button);*/
        //setBorderLayout(frame);
        //setFlowLayout(frame);
        setGridLayout(frame);
        //setAbsoluteLayout(frame);
    }



    public static void setBorderLayout(JFrame f){
        Container c=f.getContentPane();//возвращает контейнер
        BorderLayout bl=new BorderLayout(); //возвращает шаблон
        c.setLayout(bl);
        JButton button1=new JButton("OK1");
        JButton button2=new JButton("OK2");
        JButton button3=new JButton("OK3");
        JButton button4=new JButton("OK4");
        JButton button5=new JButton("OK5");
        c.add(button1,BorderLayout.WEST);
        c.add(button2,BorderLayout.EAST);
        c.add(button3,BorderLayout.NORTH);
        c.add(button4,BorderLayout.SOUTH);
        c.add(button5,BorderLayout.CENTER);
    }


    public static void setFlowLayout(JFrame f){
        Container c=f.getContentPane();//возвращает контейнер
        FlowLayout fl=new FlowLayout(); //возвращает сетку
        c.setLayout(fl);
        JButton button1=new JButton("OK1");
        JButton button2=new JButton("OK2");
        JButton button3=new JButton("OK3");
        JButton button4=new JButton("OK4");
        JButton button5=new JButton("OK5");
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
    }


    public static void setGridLayout1(JFrame f){
        Container c=f.getContentPane();//возвращает контейнер
        GridLayout gl=new GridLayout(3,5,70,60); //возвращает таблицу
        c.setLayout(gl);
        JButton button1=new JButton("OK1");
        JButton button2=new JButton("OK2");
        JButton button3=new JButton("OK3");
        JButton button4=new JButton("OK4");
        JButton button5=new JButton("OK5");
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
    }


    public static void setAbsoluteLayout(JFrame f) {
        Container c = f.getContentPane();//возвращает контейнер
        c.setLayout(null);
        JButton button1 = new JButton("OK1");
        button1.setSize(120, 50);// размеры окна
        button1.setLocation(50, 50);//положение окна при запуске относительно верхнего левого угла экрана
        JButton button2 = new JButton("OK2");
        button2.setSize(130, 60);
        button2.setLocation(150, 70);
        JButton button3 = new JButton("OK3");
        button3.setSize(110, 80);
        button3.setLocation(200, 120);
        c.add(button1);
        c.add(button2);
        c.add(button3);

    }



    public static void setGridLayout(JFrame f){
        Container c=f.getContentPane();//возвращает контейнер
        GridLayout gl=new GridLayout(3,2,30,50); //возвращает таблицу
        c.setLayout(gl);
        JMenuBar mBar=new JMenuBar();
        c.add(mBar);
        JMenu menuFile=new JMenu("File");
        JMenu menuHelp=new JMenu("Help");
        mBar.add(menuFile);
        mBar.add(menuHelp);
        JMenuItem itemNew=new JMenuItem("New");
        JMenuItem itemSave=new JMenuItem("Save");
        menuFile.add(itemNew);
        menuFile.add(itemSave);
        JMenu menuEdit=new JMenu("Edit");
        menuFile.add(menuEdit);
        JMenuItem itemCopy=new JMenuItem("Copy");
        JMenuItem itemPaste=new JMenuItem("Paste");
        menuEdit.add(itemCopy);
        menuEdit.add(itemPaste);
        /*JLabel lable=new JLabel("Hello");
        c.add(lable);*/
        /*JTextField textField=new JTextField("Ведите пароль");
        c.add(textField);*/
        /*JPasswordField jpf=new JPasswordField();
        c.add(jpf);*/
        /*JProgressBar jpb=new JProgressBar();
        jpb.setMinimum(-50);
        jpb.setMaximum(100);
        jpb.setValue(50);
        c.add (jpb);*/
        /*JSlider js=new JSlider();
        c.add(js);
        js.setToolTipText("Указывает значение");//выводит всплывающую подсказку. в данном случае на ползунок(JSlider)*/
        JCheckBox jcb=new JCheckBox("-вариант");
        c.add(jcb);
        jcb.setSelected(false);
        jcb.isSelected();//возвращает состояние флажка
        JRadioButton jrb1=new JRadioButton("Option1" );
        JRadioButton jrb2=new JRadioButton("Option2" );
        c.add(jrb1);
        c.add(jrb2);
        ButtonGroup bg=new ButtonGroup();//
        bg.add(jrb1);
        bg.add(jrb2);

    }
}


