package Lesson_4;

public class Car {
    private String model;
    private int year;
    private int way;
    private String color;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, int way) {
        this.model = model;
        this.year = year;
        this.way=way;
        }

    public Car(String model, int year, int way, String color) {
        this.model = model;
        this.year = year;
        this.way = way;
        this.color = color;
    }
    public int getPrice(){
        int price;
        if(way>0 & way<100 && year == 2023)
            price = 150000;
        else if((way>100 & 500<way) && (year>2023 & year < 2019))
            price = 100000;
        else if((way>500 & 1000<way) && (year>2019 & year <2015))
            price = 50000;
        else if((way>1000 & way<5000) && (year>2015 & year<2010))
            price = 35000;
        else price = 10000;
        return price;
    }
    public void printAllInfo(){
        System.out.println("All Info\n"+"Model: "+model+", "+"Year: "+year+","+"Way: "+way+", "+"Color: "+color+"Price: "+getPrice());
    }
    public void printShortInfo(){
        System.out.println("Short Info\n"+"Model: "+model+"\n"+"Year: "+year);
    }
}
