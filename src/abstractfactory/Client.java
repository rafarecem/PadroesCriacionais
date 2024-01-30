package abstractfactory;

public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        Product product1 = factory.createProduct1();
        Product product2 = factory.createProduct2();

        product1.Someting();
        product2.Someting();
    }
}
