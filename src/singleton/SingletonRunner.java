package singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getValue());
    }
}
