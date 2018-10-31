package singleton;

public class SingletonService {

    private volatile static SingletonService instance;
    private String name;

    private SingletonService(String name) {
        this.name = name;
    }

    // Double-Check Locking
    public static SingletonService getInstance(String name) {
        if (instance == null) {
            synchronized (SingletonService.class) {
                if (instance == null) {
                    instance = new SingletonService(name);
                }
            }
        }
        return instance;
    }
}
