package Lesson_6.Task2;

public class Server extends Computer{
    private int quanPr;

    public Server(String processor, int ram, int hdc, int quanPr) {
        super(processor, ram, hdc);
        this.quanPr = quanPr;
    }

    public int getQuanPr() {
        return quanPr;
    }

    public void setQuanPr(int quanPr) {
        this.quanPr = quanPr;
    }
}


