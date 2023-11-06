package PZ_19;

import javax.swing.*;

public class ContentPaneReplace extends JFrame{
    private static final long serialVersionUID = 1L;

    public ContentPaneReplace(){
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contents = new JPanel();
        contents.add(new JButton("OMAAGAAD"));
        contents.add(new JButton("NOOO WAAAAY"));
        setContentPane(contents);

        setSize(200, 100);
        setVisible(true);
    }
}