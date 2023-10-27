package Lesson_7;

import Lesson_6.Task2.Computer;
import Lesson_6.Task2.PersonalCompiter;
import Lesson_6.Task2.Server;
import Lesson_7.Task1.Person1;
import Lesson_7.Task2.Computer1;
import Lesson_7.Task2.PersonalCompiter1;
import Lesson_7.Task2.Server1;

/*Задания

1. Создать классы Person1 и служащий Employee1.
Класс Person является родительским, и содержит следующие данные: имя, фамилия,
год рождения. Есть также метод print(), который выводит данные этого класса.
Класс Employee является дочерним, и добавляет трудовой стаж.
Необходимо:
- Переопределить в дочернем классе метод print().
- Привести пример использования полморфизма.
2. Создать классы Computer, PersonalComputer (extends Computer), Server (extends Computer).
Computer имеет следующие параметры: процессор, ОЗУ, объем жесткого диска.
PersonalComputer имеет параметр «монитор». Server имеет параметр «количество процессоров».
- Создать в этих класса переопределенные методы.
- Привести пример использования полморфизма. */
public class Solution7 {
    public static void main(String[] args) {
        Person1 person1 =new Person1("Adi", "Zhak", 2003);
        person1.print();

        Computer1 cm = new Computer1("Intel",8,256);
        System.out.println(cm.getProcessor1()+" + "+cm.getRam1()+" + "+cm.getHdc1());
        System.out.println();
        PersonalCompiter1 pc = new PersonalCompiter1("AMD",16,512,"1280x1258");
        System.out.println(pc.getProcessor1()+" + "+pc.getRam1()+" + "+pc.getHdc1()+" + "+pc.getMonitor1());
        System.out.println();
        Server1 sv = new Server1("Intel",8,512,4);
        System.out.println(sv.getProcessor1()+" + "+sv.getRam1()+" + "+sv.getHdc1()+" + "+sv.getQuanPr1());
    }
}
