package abstractfactory;

public class FabricaConcreta2 implements AbstractFactory {

    public Product createProduct1() {
        return new ProdutoConcreto2();
    }

    @Override
    public Product createProduct2() {
        return new ProdutoConcreto();
    }

}
