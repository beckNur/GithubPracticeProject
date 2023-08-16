package Practice;

public class Testing1_PC {
    private int number;
    private String city;

    private String name;
    private String address;
    public static void main(String[] args) {
        System.out.println(Testing1_PC.class.getName());
        method1();
        mothod2();
    }

    public static void method1(){
        System.out.println("inside method1");
    }
    public static void mothod2(){
        System.out.println("inside method2");
    }
}
