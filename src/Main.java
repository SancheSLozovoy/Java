import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        setTitle("Calculator");
        getContentPane().add(new CalculatorPanel());
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 200, 400, 400);
        frame.setVisible(true);
    }
}

class CalculatorPanel extends JPanel {
    private JLabel display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        result = 0;
        lastCommand = "=";
        start = true;
        display = new JLabel("0");
        display.setFont(display.getFont().deriveFont(50f));
        display.setForeground(Color.WHITE);
        add(display, BorderLayout.NORTH);
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        ActionListener clear = new ClearAction();
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        addButton("7", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("8", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("9", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("/", command, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("4", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("5", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("6", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("*", command, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("1", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("2", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("3", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("-", command, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("0", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton(".", insert, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("=", command, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("+", command, Color.GRAY, Color.WHITE, Font.BOLD, 24);
        addButton("C", clear, Color.GRAY, Color.WHITE, Font.BOLD, 24);

        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener, Color bgColor, Color textColor, int fontStyle, int fontSize) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        button.setBackground(bgColor);
        button.setForeground(textColor);


        Font buttonFont = button.getFont();
        button.setFont(buttonFont.deriveFont(fontStyle, fontSize));

        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class ClearAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("0");
        }
    }

    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else
                    lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+"))
            result += x;
        else if (lastCommand.equals("-"))
            result -= x;
        else if (lastCommand.equals("*"))
            result *= x;
        else if (lastCommand.equals("/"))
            result /= x;
        else if (lastCommand.equals("="))
            result = x;
        display.setText("" + result);
    }
}
