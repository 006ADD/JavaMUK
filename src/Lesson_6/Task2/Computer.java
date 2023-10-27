package Lesson_6.Task2;
public class Computer {
    private String processor;
    private int ram;
    private int hdc;

    public Computer(String processor, int ram, int hdc) {
        this.processor = processor;
        this.ram = ram;
        this.hdc = hdc;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdc() {
        return hdc;
    }

    public void setHdc(int hdc) {
        this.hdc = hdc;
    }

}
