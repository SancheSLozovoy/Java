package PZ_20;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Hello {
    public static void main(String[] args){
        JFrame jframe = new JFrame(){}; //Создадим объект класса JFrame с пустым конструктором
        jframe.setVisible(true); //делаем фрэйм доступным для отображения на экране
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // метод используется для указания одного из нескольких вариантов кнопки закрытия
        jframe.setSize(500, 400); //устанавливаем размер окна
        jframe.setTitle("And the dream was so close"); //устанавливаем имя для фрэйма
    }
}


