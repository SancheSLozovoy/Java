package PZ_21;

import java.awt.Color; // Класс Color использутся для импорта цветов
import java.awt.Graphics2D; // Определяет текущее графическое состояние, а также методы графического вывода
import java.awt.geom.Path2D; //библиотека для создания фигур на экарне

public class Light { //прописываем поля
    private Color color; //поля цвета
    private int y; //поля расположения по y

    public Light(Color color, int y){ //прописываем конструктор
        this.color = color;
        this.y = y;
    }

    public void drawLight(Graphics2D g2d){ //прописываем метод для создания овалов
        g2d.setColor(color.WHITE); //объявляем цвет для фигуры
        g2d.fillOval(315, y-15, 100, 100); //объявлямем размеры фигуры и ее расположение
        g2d.setColor(color.DARK_GRAY);
        g2d.fillOval(315, y-8, 100, 100);
        g2d.setColor(color);
        g2d.fillOval(320, y, 90, 90);
    }

    public void drawEar(Graphics2D g2d){ //прописываем метод для создания боковых плашек
        int x = 440; //расстояние между плашками по x
        int x2 = 290; //по y
        g2d.setColor(Color.DARK_GRAY); //объявляем цвет для фигуры
        Path2D.Double ear = new Path2D.Double(); //создаем объект
        ear.moveTo(x, y+59); //Перемещает начальную точку на координаты x, y.
        ear.lineTo(x, y+41); //Соединяет последнюю точку подпути с x, y координатами.
        ear.quadTo(x, y-1, x+5, y-1); //прилаем фигуре определенную форму
        ear.lineTo(x+60, y-1);
        ear.quadTo(x+65, y-1, x+65, y+6);
        ear.lineTo(x+5, y+64);
        ear.quadTo(x, y+64, x, y+59);
        g2d.fill(ear);

        Path2D.Double ear2 = new Path2D.Double();
        ear2.moveTo(x2, y+59);
        ear2.lineTo(x2, y+4);
        ear2.quadTo(x2, y-1, x2-5, y-1);
        ear2.lineTo(x2-60, y-1);
        ear2.quadTo(x2-65, y-1, x2-65, y+6);
        ear2.lineTo(x2-5, y+64);
        ear2.quadTo(x2, y+64, x2, y+59);
        g2d.fill(ear2);
    }
}
