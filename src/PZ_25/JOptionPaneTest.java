package PZ_25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneTest extends JFrame {
    private JPanel contents;
    private JButton btnGreeting;

    public JOptionPaneTest(){
        super("Регистрация в программе");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");

        contents = new JPanel();

        btnGreeting = new JButton("Начать регистрацию");

        addListeners();

        contents.add(btnGreeting);

        setContentPane(contents);
        setSize(400, 150);
        setVisible(true);
    }

    private void addListeners(){
        btnGreeting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(null,
                        "Привет! Хотите зарегистрироваться в нашей программе?",
                            "Регистрация",
                                JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.NO_OPTION) {
                    System.exit(0);
                } else {
                    String username = "";
                    while (username.length() < 5 || username.contains(" ")) {
                        username = JOptionPane.showInputDialog(null,
                                "Введите логин (не менее 5 символов, без пробелов):",
                                    "Логин",
                                        JOptionPane.INFORMATION_MESSAGE);
                    }

                    String password = "";
                    while (password.length() < 8 || password.contains(" ")) {
                        password = JOptionPane.showInputDialog(null,
                                "Введите пароль (не менее 8 символов, без пробелов, должен содержать цифры и буквы):",
                                    "Пароль",
                                        JOptionPane.INFORMATION_MESSAGE);
                    }

                    String confirmPassword = JOptionPane.showInputDialog(null,
                            "Повторите пароль:",
                                "Подтверждение пароля",
                                    JOptionPane.INFORMATION_MESSAGE);
                    while (!confirmPassword.equals(password)) {
                        confirmPassword = JOptionPane.showInputDialog(null,
                                "Пароли не совпадают. Повторите пароль:",
                                    "Подтверждение пароля",
                                        JOptionPane.INFORMATION_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(null,
                            "Поздравляем, вы успешно зарегистрировались!",
                                "Регистрация завершена",
                                    JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}