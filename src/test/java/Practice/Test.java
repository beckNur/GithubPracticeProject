package Practice;

public class Test {
    SharedData sharedData;

    public Test(){
        this.sharedData = new SharedData();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sharedData.getClassWithMethods().printMsg();
    }
}
