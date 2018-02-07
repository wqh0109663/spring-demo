package statics.test;

/**
 * Created by wqh on 2018/2/7.
 */
public class Cars {
    private String carname;
    private int pricr ;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public int getPricr() {
        return pricr;
    }

    public void setPricr(int pricr) {
        this.pricr = pricr;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carname='" + carname + '\'' +
                ", pricr=" + pricr +
                '}';
    }

    public Cars() {
    }

    public Cars(String carname, int pricr) {
        this.carname = carname;
        this.pricr = pricr;
    }
}
