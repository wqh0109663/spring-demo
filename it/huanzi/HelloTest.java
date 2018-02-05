package it.huanzi;

/**
 * Created by wqh on 2018/2/5.
 */
public class HelloTest {
    private String name ;
    private String addr ;
    private Person p ;

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public HelloTest() {
        System.out.println("construtor....");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name+"........");

        }

    public HelloTest(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
}
