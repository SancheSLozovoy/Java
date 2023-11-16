package PZ_23;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;     //импорты классов из пакетов авт и Swing, которые будут использоваться в дальнейшем коде для создания графического интерфейса

public class TestFrame extends JFrame{
    private static final long serialVersionUID = 1L;
    private  JTextField textField;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public TestFrame() {
        super("Test frame");
        createGUI();
    }  //Этот блок начинает объявление класса TestFrame, который наследуется от класса JFrame и содержит поля textField, button1, button2 и button3, предназначенные для текстового поля и кнопок

    public void createGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выход на кнопку

        JPanel panel = new JPanel(); //панель для расположения элементов
        panel.setLayout(new FlowLayout()); //устанавливаем flow layout

        button1 = new JButton("Button 1"); //объявляем кнопку 1 с текстом
        button1.setActionCommand("Button 1 was pressed"); //определяем действие при нажатии
        panel.add(button1); //добавляем кнопку на панель


        button2 = new JButton("Button 2");
        button2.setActionCommand("Button 2 was pressed");
        panel.add(button2);

        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was pressed");
        panel.add(button3);

        textField = new JTextField();  //объект для текствого поля
        textField.setColumns(23);  //определяем размерность текстового поля
        panel.add(textField);  //добавляем текстовое поле на панель

        ActionListener actionListener = new TestActionListener(); //объект для выполнения действия с кнопками

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener); //добавление кнопок на действие
        button3.addActionListener(actionListener);

        getContentPane().add(panel);  //добавление панели в приложение
        setPreferredSize(new Dimension(320, 100));  //определяем размер окна
    }

    //Метод инициализирует графический интерфейс, создавая панель, на которой размещаются три кнопки и текстовое поле, тут устанавливается действие при нажатии на кнопки

    public class TestActionListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //Класс TestActionListener реализует интерфейс ActionListener и обрабатывает события при нажатии на кнопки. В зависимости от нажатой кнопки происходит определенное действие
            JButton button = (JButton) e.getSource();
            System.out.println(button.getText() + ", " + e.getActionCommand());

            if (e.getSource() != button3){
                textField.setText(e.getActionCommand());
            }else {
                ActionEvent el = new ActionEvent(button2, Event.MOUSE_DOWN, "Button 2 was pressed programmatically");
                ActionListener[] listeners;
                listeners = button2.getActionListeners();
                listeners[0].actionPerformed(el);
            }
            textField.setText(e.getActionCommand());
        }
    }


    //запуск
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });

        //main создает экземпляр класса TestFrame и отображает окно на экране
    }
}
