package Lesson_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2. Создайте программу InputName.java. При выполнении этой программы необходимо задать в качестве аргументов три имени.
//        Программа должна вывести приветствие для каждого имени. Н-р,
//
//        Hello, Homer
//        Hello, Bart
//        Hello, Liza
public class InputName {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Hello "+ s);
    }
}
