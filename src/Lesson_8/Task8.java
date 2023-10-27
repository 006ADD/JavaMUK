package Lesson_8;
/**Задания

 Создать тестовый класс. Класс содержит следующие элементы:
 1. Статическая переменная, которая является счетчиком создания количества экземпляров (объектов) этого класса.
 2. Статический метод, который печатает значение вышеуказанной переменной. */
public class Task8 {
    public static void main(String[] args) {
        oneCl cl1 = new oneCl();
        oneCl cl2 = new oneCl();
        oneCl cl3 = new oneCl();
        oneCl cl4 = new oneCl();
        oneCl cl5 = new oneCl();
        oneCl cl6 = new oneCl();
        oneCl cl7 = new oneCl();
        oneCl cl8 = new oneCl();
        oneCl cl9 = new oneCl();
        oneCl cl10 = new oneCl();
        cl10.Print();
    }
    public static class oneCl{
        public static int COUNT=1;
        private int id;
        public oneCl() {
            id=COUNT++;
        }
        public void Print(){
           // System.out.printf("Id: %d \n", id);
            System.out.println("Id: "+id);
        }
    }
}
