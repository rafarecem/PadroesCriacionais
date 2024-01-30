package Prototype;

public class Main {
    public static void main(String[] args) {
        ProdutoPrototipado produtoPrototipado = ProdutoPrototipado.getInstance();

        Produto livro = produtoPrototipado.criarLivro("O Senhor dos Anéis", 200.0, "J.R.R. Tolkien", 1000);

        System.out.println(livro);
    }
}
