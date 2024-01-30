package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar que objetos sejam criados explicitamente
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
