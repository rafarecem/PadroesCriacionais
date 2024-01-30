package Prototype;

public class ProdutoPrototipado {
    private static ProdutoPrototipado instance;

    private ProdutoPrototipado() {
    }

    public static ProdutoPrototipado getInstance() {
        if (instance == null) {
            instance = new ProdutoPrototipado();
        }

        return instance;
    }

    public Produto criarLivro(String nome, double preco, String autor, int paginas) {
        Livro livro = new Livro(nome, preco, autor, paginas);
        return livro.clone();
    }
}
