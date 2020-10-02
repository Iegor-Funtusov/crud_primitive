package ua.com.alevel.oop;

/**
 * @author Iehor Funtusov, created 02/10/2020 - 8:36 PM
 */

public class LandRover extends BritishCar {

    private int year;

    public LandRover() {}

    private LandRover(int year) {
        this();
        this.year = year;
    }

    public LandRover(int year, String type) {
        this(year);
        super.setType(type);
    }

    public LandRover(int year, String type, Object o) {
        this(year, type);
        super.setType(type);
    }

    public void setType(String type) {
        super.setType(type);
    }

    public void go() {
        System.out.println("go LandRover");
    }

    public void setMorePrice(String morePrice) {
        super.setMorePrice(morePrice);
    }

    public String getMorePrice() {
        return super.getMorePrice();
    }

    public String getType() {
        return super.getType();
    }

    public String getType(Object o) {
        return super.getType();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2015) {
            System.out.println(" fuck you ");
            return;
        }
        this.year = year;
    }
}
