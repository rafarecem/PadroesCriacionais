package factorymethod;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo com largura " + largura + " e altura " + altura);
    }
}
