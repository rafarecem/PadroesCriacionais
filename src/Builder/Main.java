package Builder;

public class Main {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroBuilder("Fiat");

        builder.setModelo("Palio");
        builder.setAno(2023);
        builder.setCor("Vermelho");
        builder.setPotencia(100);

        Carro carro = builder.build();

        System.out.println(carro);
    }
}
