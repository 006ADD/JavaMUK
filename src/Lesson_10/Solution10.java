package Lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задания
 1. Создать одномерный массив. Вывести на экран элемент массива с заданным индексом.
 Программа должна обрабатывать ошибку выхода индекса за диапазон массива:
 - Если индекс меньше нуля, то вывести сообщение «Индекс меньше нуля».
 - Если индекс больше размера массива, то вывести сообщение «Индекс больше размера массива».
 2. Создать следующий метод:
 static int sum(int a, int b)
 Данный метод возвращает сумму заданных параметров. Параметры могут быть только положительные.
 Если какой-либо параметр отрицательный, то выбросить соответствующее исключение с названием параметра.
 Исключение должно обрабатываться за пределами метода.
 3. Дана строка, которая содержит целое число. Например:
 String s = “10”;
 Преобразовать эту строку в значение типа int. Для этого использовать метод parseInt() класса Integer.
 Если строка не может быть преобразована в число (пример c «a10»), то выдать соответствующее сообщение. */
public class Solution10 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        int num = Integer.parseInt(str1);
        method1(num);
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        int num1 = Integer.parseInt(str2), num2 = Integer.parseInt(str3);
        method2(num,num2);
        String str4 = reader.readLine();
        method3(str4);
    }
    public static void method1(int num){
        int[] array = new int[10];
        try{
            System.out.println(array[num]);
        }catch(ArrayIndexOutOfBoundsException e){
            if(num<0)
                System.out.println("Index less than zero!");//Индекс меньше нуля
            else
                System.out.println("The index is larger than the size of the array!");//Индекс больше размера массива
        }
    }
    public static int method2(int num1, int num2)throws Exception{
        if(num1<0 && num2<0)
            throw new IndexOutOfBoundsException("Your numbers are less than zero");
        else
            return num1 + num2;
    }
    public static void method3(String string){
        try {
            int strNum = Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.println("nim");
        }
    }
}
