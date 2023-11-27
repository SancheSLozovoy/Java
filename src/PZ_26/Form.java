package PZ_26;

import javax.swing.*;

public class Form extends JFrame{
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

    public Form() {
        this.getContentPane().add(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
