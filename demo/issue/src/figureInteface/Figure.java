package figureInteface;

/*1.Реализовать интерфейс «Фигура». Интерфейс содержит сигнатуры трех методов.
Первый метод возвращает периметр фигуры типом int. Второй метод возвращает площадь фигуры типом int.
Третий метод возвращает имя фигуры типом String.
2.Создать три (квадрат,прямоугольник,правильный шестиугольник)класса,которые реализуют интерфейс фигура.
3.В классах должен быть конструктор,который на вход принимает все необходимые параметры (стороны,имя и т.д.).
4.Создать figureInteface.Main класс,в котором в методе public static void main(String[] args) {} создать все три класса и вывести
на печать результаты выполнения методов
 */
public interface Figure {
    public void name();

    public void area();

    public void perimeter();

    }

