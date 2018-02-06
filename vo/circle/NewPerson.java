package vo.circle;

/**
 * Created by wqh on 2018/2/6.
 */
public class NewPerson {
    private String name ;
    private int age ;

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

    public NewPerson() {
        System.out.println("newperson constructor ....");
    }
    public void init2(){
        System.out.println("init2  run .....");
    }
    public void destory2(){
        System.out.println("destory2  run.....");
    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
