package spel.test;

/**
 * Created by wqh on 2018/2/6.
 */
public class Car {
    private  String carname;
    private int carPrice ;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carname='" + carname + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
