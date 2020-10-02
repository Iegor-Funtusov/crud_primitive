package ua.com.alevel.oop;

/**
 * @author Iehor Funtusov, created 02/10/2020 - 8:13 PM
 */

public abstract class Car {

    private String type;
    private Integer number;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
