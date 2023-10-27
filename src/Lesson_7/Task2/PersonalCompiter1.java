package Lesson_7.Task2;

public class PersonalCompiter1 extends Computer1 {
    private String monitor;

    public PersonalCompiter1(String processor, int ram, int hdc, String monitor) {
        super(processor, ram, hdc);
        this.monitor = monitor;
    }

    public String getMonitor1() {
        return monitor;
    }

    public void setMonitor1(String monitor) {
        this.monitor = monitor;
    }
}
