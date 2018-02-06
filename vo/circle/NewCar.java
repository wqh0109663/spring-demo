package vo.circle;

/**
 * Created by wqh on 2018/2/6.
 */
public class NewCar {
    private String carName;
    private int price ;

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

    public NewCar() {
        System.out.println("NewCar constructor ....");
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }
}
