package factorymethod;

public class Main {

    public static void main(String[] args) {
        FabricaDeFormasGeometricas fabrica = new FabricaDeFormasGeometricasSimples();

        FormaGeometrica forma = fabrica.criarForma("circulo");
        forma.desenhar();

        forma = fabrica.criarForma("retangulo");
        forma.desenhar();
    }

}
