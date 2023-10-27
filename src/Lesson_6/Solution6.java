package Lesson_6;

import Lesson_6.Task1.Employee;
import Lesson_6.Task1.Person;
import Lesson_6.Task2.Computer;
import Lesson_6.Task2.PersonalCompiter;
import Lesson_6.Task2.Server;

/**Задания
 1. Создать классы Person и служащий Employee.
 Класс Person является родительским, и содержит следующие данные: имя, фамилия, год рождения.
 Класс Employee является дочерним, и содержит трудовой стаж, а также метод,
 вычисляющий оклад в зависимости от возраста и стажа.
 Необходимо:
 - создать соответствующие конструкторы
 - использовать соответствующие модификаторы доступа для членов класса

 2. Создать классы Computer, PersonalComputer, Server.
 Computer имеет следующие параметры:
 - процессор
 - ОЗУ
 - объем жесткого диска
 PersonalComputer имеет параметр «монитор». Server имеет параметр «количество процессоров».
 Оба эти класса также содержать метод, который вычисляет стоимость компьютера в зависимости от параметров.
 Также необходимо:
 - создать соответствующие конструкторы
 - использовать соответствующие модификаторы доступа для членов класса*/
public class Solution6 {
    public static void main(String[] args) {
        Person person = new Person("Adilet", "Zhakypbekov", 2003);
        Employee employee = new Employee("Kateleya", "Ivanova", 2003,15);
        employee.salary();

        //
        Computer cm = new Computer("Intel",8,256);
        System.out.println(cm.getProcessor()+" + "+cm.getRam()+" + "+cm.getHdc());
        System.out.println();
        PersonalCompiter pc = new PersonalCompiter("AMD",16,512,"1280x1258");
        System.out.println(pc.getProcessor()+" + "+pc.getRam()+" + "+pc.getHdc()+" + "+pc.getMonitor());
        System.out.println();
        Server sv = new Server("Intel",8,512,4);
        System.out.println(sv.getProcessor()+" + "+sv.getRam()+" + "+sv.getHdc()+" + "+sv.getQuanPr());
    }
}
