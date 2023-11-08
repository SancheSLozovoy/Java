package PZ_21;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class DrawingCanvas extends JComponent {
    private int width; //ширина
    private int height; //длина
    private Light red = new Light(Color.RED, 270); //назначем цвет для сигнала и его положение по y
    private Light yellow = new Light(Color.YELLOW, 380);
    private Light green = new Light(Color.GREEN, 490);

    public DrawingCanvas(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void paintComponent(Graphics g) { // прорисовка компонента
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRoundRect(300, 240, 130, 360, 25, 25); //устанавливаем расположение, ширину и длину объекта основной части светофора
        g2d.fillRoundRect(335, 603, 60, 65, 15, 15); //палка снизу
        red.drawLight(g2d); //назначаем цвета для светофора
        yellow.drawLight(g2d);
        green.drawLight(g2d);

        Path2D.Double hat = new Path2D.Double();
        hat.moveTo(320, 230);
        hat.lineTo(410, 230);
        hat.quadTo(410.5, 225.5, 410, 225);
        hat.curveTo(390, 215, 330, 215, 320, 225);
        hat.quadTo(315.5, 225.5, 320, 230);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(hat);

        red.drawEar(g2d);
        yellow.drawEar(g2d);
        green.drawEar(g2d);
    }
}
