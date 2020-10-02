package ua.com.alevel.oop;

/**
 * @author Iehor Funtusov, created 02/10/2020 - 8:24 PM
 */

public class Mersedes extends GermanCar {

    public void setType(String type) {
       super.setType(type);
    }

    public void go() {
        System.out.println("go Mersedes");
    }


    public String getType() {
        return super.getType();
    }
}
