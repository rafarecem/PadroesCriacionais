package abstractfactory;

public class FabricaConcreta1 implements AbstractFactory {

    @Override
    public Product createProduct1() {
        return new ProdutoConcreto();
    }

    @Override
    public Product createProduct2() {
        return new ProdutoConcreto2();
    }

}
