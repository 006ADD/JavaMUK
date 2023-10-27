package Lesson_6.Task2;

public class PersonalCompiter extends Computer{
    private String monitor;

    public PersonalCompiter(String processor, int ram, int hdc, String monitor) {
        super(processor, ram, hdc);
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
