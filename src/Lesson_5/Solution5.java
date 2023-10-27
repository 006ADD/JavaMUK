package Lesson_5;

public class Solution5 {
    public static void main(String[] args) {

    }
    public static class Animal{}

    public static class Predator extends Task5_1.Animal {}

    public static class Lev extends Task5_1.Predator {}


    public static class Herbivorous extends Task5_1.Animal {}

    public static class Cow extends Task5_1.Herbivorous {}
    class Person{
        private String name;
        private String lastName;
        private int age;

        public Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        public void printOne(){
            System.out.println(name+" "+lastName+" "+ age);
        }
    }
    class Student{
        private String VUZ;
        private String facultet;
        private String kurs;

        public Student(String VUZ, String facultet, String kurs) {
            this.VUZ = VUZ;
            this.facultet = facultet;
            this.kurs = kurs;
        }
        public void printTwo(){
            System.out.println(VUZ+" "+facultet+" "+kurs);
        }
    }
    class Employee{
        private String workInMesto;
        private String doljnost;

        public Employee(String workInMesto, String doljnost) {
            this.workInMesto = workInMesto;
            this.doljnost = doljnost;
        }
        public void printThree(){
            System.out.println(workInMesto+" "+doljnost);
        }
    }
}
