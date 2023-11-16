package PZ_24;

import javax.swing.*;

public class JOptionPaneTest extends JFrame {
    private JPanel contents = null;
    private JButton btnMessage1 = null;
    private JButton btnMessage2 = null;
    private JButton btnMessage3 = null;

    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnConfirm3 = null;

    private ImageIcon icon = null;
    private final String TITLE_message = "Окна сообщение";
    private final String TITLE_confirm = "Окна подтверждение";
    private String[] drink = {"Сок",
                              "Минералка",
                              "Лимонад",
                              "Пиво"};

    public JOptionPaneTest(){
        super("Пример использования JOptionPane");

        //Локализация кнопок
        UIManager.put("OptionalPane.yesButtonText", "Da");
        UIManager.put("OptionalPane.noButtonText", "Net");
        UIManager.put("OptionalPane.cancelButtonText", "Otmena");

        contents = new JPanel();

        //иконка для отображения в окне сообщений
        icon = new ImageIcon("png.png");

        //кнопка формирования окна по двум параметрам
        btnMessage1 = new JButton("MessageDialog 2");

        btnMessage2 = new JButton("MessageDialog 4");

        btnMessage3 = new JButton("MessageDialog 5");
    }
}
