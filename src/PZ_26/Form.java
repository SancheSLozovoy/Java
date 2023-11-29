package PZ_26;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JSpinner spinner1;
    private JRadioButton мужскойRadioButton;
    private JRadioButton женскийRadioButton;
    private JComboBox comboBox1;
    private JCheckBox другойЦветCheckBox;
    private JTextField textField2;
    private JSlider slider1;
    private JList list1;
    private JButton отправитьButton;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox2;

    public Form() {
        this.getContentPane().add(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField2.setEnabled(false);

        другойЦветCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setEnabled(другойЦветCheckBox.isSelected());
            }
        });

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(мужскойRadioButton);
        radioButtonGroup.add(женскийRadioButton);

        отправитьButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Данные");
                System.out.println("Хозяин: " + textField1.getText());
                System.out.println("Возраст: " + spinner1.getValue());
                System.out.println("Пол: " + (мужскойRadioButton.isSelected() ? "Мужской" : "Женский"));
                System.out.println("Телефон: " + textField3.getText());
                System.out.println("Почта: " + textField4.getText());
                System.out.println("Питомец");
                System.out.println("Кличка: " + textField5.getText());
                System.out.println("Вид: " + comboBox1.getSelectedItem());
                System.out.println("Цвет: " + comboBox2.getSelectedItem());
                System.out.println("Другой цвет: " + textField2.getText());
                System.out.println("Рост: " + slider1.getValue());
                System.out.println("Любимые игрушки: " + list1.getSelectedValuesList());
            }
        });
    }
}
