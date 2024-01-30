package factorymethod;

public class FabricaDeFormasGeometricasSimples extends FabricaDeFormasGeometricas {
    public FormaGeometrica criarForma(String tipo) {
        if (tipo.equals("circulo")) {
            return new Circulo(10.0);
        } else if (tipo.equals("retangulo")) {
            return new Retangulo(20.0, 30.0);
        } else {
            throw new IllegalArgumentException("Tipo de forma geométrica inválido");
        }
    }
}
