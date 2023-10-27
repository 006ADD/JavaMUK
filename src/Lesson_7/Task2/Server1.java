package Lesson_7.Task2;

public class Server1 extends Computer1 {
    private int quanPr;

    public Server1(String processor, int ram, int hdc, int quanPr) {
        super(processor, ram, hdc);
        this.quanPr = quanPr;
    }

    public int getQuanPr1() {
        return quanPr;
    }

    public void setQuanPr1(int quanPr) {
        this.quanPr = quanPr;
    }
}


