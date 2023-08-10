package Practice;

public class SharedData {
    private ClassWithMethods classWithMethods;

    public SharedData(){
        this.classWithMethods = new ClassWithMethods();
    }

    public ClassWithMethods getClassWithMethods(){
        return classWithMethods;
    }

}
