package Lesson_11;

import Lesson_11.math.Calc;

import java.util.*;

/*Задания
1. Создать пакет math. Добавить в него класс Calc со следующими методами:
public static int sum(int a, int b)
	public static int max(int a, int b)
Метод sum() должен возвращать сумму указанных параметров; max() – максимум.
Создать пакет run. Добавить в него класс Main. В этом классе использовать методы класса Calc.
2. Отсортировать одномерный числовой массив. Для этого использовать метод sort() класса Arrays (из пакета java.util).
3. Вывести содержимое массива без использования цикла. Использовать метод toString() класса Arrays.
4. Вывести номер текущего месяца. Использовать метод getMonth() класса Date (пакет java.util).
5. Привести пример использования классов ArrayList и HashMap (пакет java.util).*/
public class Solution11 {
    public static void main(String[] args) {
        method4();
    }
    public static void method2and3(){
        int[] arr = {9,2,4,6,3,1,5,7,5,6};
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void method4(){
        Date dt = new Date();
        System.out.println(dt.getMonth());
    }
    public static void method5(){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++)
            list.add(i);
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

    }
}
