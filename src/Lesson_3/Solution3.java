package Lesson_3;

import java.util.Arrays;

//            Задания
//        1. Создать файл Text.java. Файл должен содержать пример использования методов length, charAt, equals и операции конкатенации для String.
//        2. Создать массивы с размерами 3, 4 и 5. Содержимое массивов оставить по умолчанию. Вывести на экран размеры массивов.
//        3. Дан номер месяца. Вывести название месяца на экран. Использовать оператор switch.
//        4. Даны два числа. Вывести все значения между этими числами. Использовать оператор while.
//        5. Создать числовой массив из 10 элементов. Заполнить массив любыми числами и вывести на экран содержимое массива. Использовать оператор for.
//        6. Дан числовой массив. Вывести все элементы массива до первого отрицательного значения. Использовать оператор break.
//        7. Дан числовой массив. Вывести все четные элементы. Использовать оператор continue.
//        8. Дан двумерный числовой массив. Найти максимальный элемент в массиве
public class Solution3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3(9);
        task4(1,10);
        task5();
        task6();
        task7();
        task8();

    }
    private static void task1(){
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.equals("hello"));
    }
    private static void task2(){
        int arrOne[] = {1,3,2};
        int[] arrTwo = {6,4,7,5};
        int[] attThree = {9,10,13,11,12};
        System.out.println(arrOne.length + " "+ arrTwo.length+ " "+attThree.length);
    }
    private static void task3(int month){
        switch (month) {
            case 1:
                System.out.println("January"); break;
            case 2:
                System.out.println("February"); break;
            case 3:
                System.out.println("March"); break;
            case 4:
                System.out.println("April"); break;
            case 5:
                System.out.println("May"); break;
            case 6:
                System.out.println("June"); break;
            case 7:
                System.out.println("July"); break;
            case 8:
                System.out.println("August "); break;
            case 9:
                System.out.println("September"); break;
            case 10:
                System.out.println("Octember"); break;
            case 11:
                System.out.println("November"); break;
            case 12:
                System.out.println("December"); break;
            default:
                if(month == 0 || month > 12) System.out.println("ERROR");
                break;


        }
    }
    public static void task4(int a, int b){
        int count=a;
        while(a>=b){
            System.out.print(count++ +" ");
        }
    }
    public static void task5(){
        int[] arr1 = {9,4,10,1,5,6,7,1,8,7,5,6};
       for(int i=0; i<arr1.length;i++ ){
           System.out.print(arr1[i]+" ");
       }
    }
    public static void task6(){
        int[] array = {9,4,3,7,1,-1,5,8,10};
        for(int i=0;i<array.length;i++){
            if(array[i]<0) {
                System.out.println();
                System.out.println(array[i]);
                break;
            }
        }
    }
    public static void task7(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                continue;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void task8(){
        int max=0;
        int[][] array = {{1,2,33,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,55,20}};
        for(int i=0;i<array.length;i++){ // 2
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
