package PZ_21;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        int w = 900;
        int h = 800;

        JFrame f = new JFrame(); //объявляем фрейм
        DrawingCanvas dc =new DrawingCanvas(w, h);
        f.setSize(w,h); //устанавливаем длину и ширину окна
        f.setTitle("Светофор"); //название окна
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие на кнопку exit
        f.setVisible(true);//делаем доступным для вида
    }
}
