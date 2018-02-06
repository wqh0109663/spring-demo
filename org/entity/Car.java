package org.entity;

/**
 * Created by wqh on 2018/2/6.
 */
public class Car {
    private String carName;
    private int price;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }



}
