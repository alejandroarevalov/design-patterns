package singleton;

public class Singleton {

    private static Singleton instance;
    private String value;

    private Singleton() {
        value = "Hello everyone!";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
