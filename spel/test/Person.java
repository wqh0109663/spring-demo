package spel.test;

/**
 * Created by wqh on 2018/2/6.
 */
public class Person {

    private String name ;
    private int age ;
    private double carprice ;

    public double getCarprice() {
        return carprice;
    }

    public void setCarprice(double carprice) {
        this.carprice = carprice;
    }

    private CarEntity carEntity ;

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carprice=" + carprice +
                ", carEntity=" + carEntity +
                '}';
    }
}
