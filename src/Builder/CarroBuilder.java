package Builder;

public class CarroBuilder {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int potencia;

    public CarroBuilder(String marca) {
        this.marca = marca;
    }

    public CarroBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public CarroBuilder setPotencia(int potencia) {
        this.potencia = potencia;
        return this;
    }

    public Carro build() {
        return new Carro(marca, modelo, ano, cor, potencia);
    }
}
