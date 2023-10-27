package Lesson_4;
/**Задания
 Создать класс Car (автомобиль). Автомобиль имеет следующие данные:
 - модель (Honda, BMW, др.)
 - год выпуска (1995, 2000, др.)
 - пробег (в км)
 - цвет (синий, белый, др.)
 Типы и имена переменных определить самим.Класс должен иметь несколько конструкторов.
 Различные конструкторы могут принимать разное количество параметров.
 Например:
 - Один конструктор имеет только параметры модели и цвета. В этом случае, остальные данные присваиваются по умолчанию: год – 2009; пробег – 0 км, и др.
 - Другой конструктор может иметь параметры для всех данных.
 Класс имеет следующие методы:
 - getPrice() возвращает стоимость автомобиля (в USD) в зависимости от параметров. Формулу расчета определить самим.
 - printAllInfo() – печатает все данные автомобиля, включая стоимость.
 - printShortInfo() – печатает только краткую информацию: модель, год и цена.
 Создайте несколько объектов, используя данный класс. */
public class Solution4 {
    public static void main(String[] args) {
        Car car = new Car("BMW",2015, 12345678, "Ciniy") ;
        car.getPrice();
        car.printAllInfo();
        car.printShortInfo();
    }
}