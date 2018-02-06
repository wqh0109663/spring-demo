package spel.test;

/**
 * Created by wqh on 2018/2/6.
 */
public class CarEntity {
    private  String carname;
    private double carPrice ;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carname='" + carname + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
