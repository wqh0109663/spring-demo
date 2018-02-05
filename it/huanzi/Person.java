package it.huanzi;

/**
 * Created by wqh on 2018/2/5.
 */
public class Person {
    private String userName;
    private int age ;

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public Person() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
