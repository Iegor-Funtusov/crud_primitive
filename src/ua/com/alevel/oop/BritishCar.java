package ua.com.alevel.oop;

/**
 * @author Iehor Funtusov, created 02/10/2020 - 8:35 PM
 */

public abstract class BritishCar extends Car implements CarProcess, RightBaranka {

    private String morePrice;

    public void setMorePrice(String morePrice) {
        this.morePrice = morePrice;
    };
    public String getMorePrice() {
        return this.morePrice;
    }
}
