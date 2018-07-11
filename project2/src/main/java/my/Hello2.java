package my;

public class Hello2 {
    private HelloRoot helloRoot = new HelloRoot();
    private Hello1 hello1 = new Hello1();

    public String hello(String name) {

        return "(project2) Hello, " + name;
    }
}
