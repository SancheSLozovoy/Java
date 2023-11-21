package PZ_25;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
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
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

        contents = new JPanel();

        btnGreeting = new JButton("Регистрация");

        addListeners();

        contents.add(btnGreeting);

        setContentPane(contents);
        setSize(400, 150);
        setLocationRelativeTo(null);
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

                    JOptionPane.showMessageDialog(null,
                            "Введите пароль (не менее 8 символов, без пробелов, должен содержать цифры и буквы):",
                            "Ошибка",
                            JOptionPane.INFORMATION_MESSAGE);
                    JPasswordField passwordField = new JPasswordField();
                    int option = JOptionPane.showOptionDialog(null, passwordField,
                            "Введите пароль",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                    if (option != JOptionPane.OK_OPTION) {
                        System.exit(0);
                    }
                    String password = new String(passwordField.getPassword());
                    while (password.length() < 8 || password.contains(" ") || !passwordContains(password)) {
                        option = JOptionPane.showOptionDialog(null, passwordField,
                                "Введите пароль (не менее 8 символов, без пробелов, должен содержать цифры и буквы):",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                        if (option != JOptionPane.OK_OPTION) {
                            System.exit(0);
                        }
                        password = new String(passwordField.getPassword());
                    }



                    JPasswordField confirmPasswordField = new JPasswordField();

                    option = JOptionPane.showOptionDialog(null, confirmPasswordField,
                            "Повторите пароль:",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                    if (option != JOptionPane.OK_OPTION) {
                        System.exit(0);
                    }

                    String confirmPassword = new String(confirmPasswordField.getPassword());

                    while (!confirmPassword.equals(password)) {
                        option = JOptionPane.showOptionDialog(null, confirmPasswordField,
                                "Пароли не совпадают. Повторите пароль:",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                        if(option != JOptionPane.OK_OPTION) {
                            System.exit(0);
                        }

                        confirmPassword = new String(confirmPasswordField.getPassword());
                    }



                    JOptionPane.showMessageDialog(null,
                            "Поздравляем, вы успешно зарегистрировались!",
                            "Регистрация завершена",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public boolean passwordContains(String password){
        boolean hasDigit =false;
        boolean hasLetter = false;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
            }else if(Character.isLetter(c)){
                hasLetter = true;
            }
        }
        return hasDigit && hasLetter;
    }
}



