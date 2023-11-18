package PZ_25;

import javax.swing.JPanel;  //библиотека для панели приложения
import javax.swing.JFrame;  //для создания приложения
import java.awt.event.ActionEvent;  //для работы с действиями кнопки
import javax.swing.JButton;  //для создания кнопок
import javax.swing.UIManager;  //для локализации кнопок
import javax.swing.JOptionPane;  //для диалоговых окон
import java.awt.event.ActionListener;  //для работы с действиями кнопки

public class JOptionPaneTest extends JFrame{
    private JPanel contents = null;
    private JButton btnMessage1 = null;
    private JButton btnMessage2 = null;
    private JButton btnMessage3 = null;

    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnConfirm3 = null;

    private JButton btnInput1 = null;
    private JButton btnInput2 = null;
    private JButton btnInput3 = null;

    public JOptionPaneTest(){
        super("Hello Mir");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        UIManager.put("OptionPane.yesButtonText", "DA");
        UIManager.put("OptionPane.noButtonText", "NET");
        UIManager.put("OptionPane.cancelButtonText", "OTMENA ");

        contents = new JPanel();

        btnInput1 = new JButton("Hello mir");

        addInputListener();

        contents.add(btnInput1);

        //добавление панели в приложение
        setContentPane(contents);
        setSize(600, 200);
        setVisible(true);
    }


    private void addInputListener(){
        btnInput1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object result = JOptionPane.showConfirmDialog(null,
                        "Hello. Зарегайся в программе", "Приветсвие", JOptionPane.YES_NO_OPTION);
                JOptionPane.showConfirmDialog(null,
                        "Hello. Зарегайся в программе", "Приветсвие", JOptionPane.YES_NO_OPTION);
            }
        });

    }
}
