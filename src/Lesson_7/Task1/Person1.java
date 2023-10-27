package Lesson_7.Task1;

public class Person1 {
    private String lastName;
    private String name;
    private int year;

    public Person1(String lastName, String name, int year) {
        this.lastName = lastName;
        this.name = name;
        this.year = year;
    }
    public void print(){
        System.out.println(lastName + " " +name+" "+year);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
