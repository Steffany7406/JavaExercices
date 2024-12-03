// Usando array dentro de um objeto para exibir um recibo em lista.

import java.util.ArrayList; // Importando ArrayList
import java.util.List;      // Importando List

class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Pedido {
    private int numero;
    private String data;
    private List<Produto> produtos;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
            System.out.println("Produto: " + produto.getNome() + " adicionados ao pedido");
    }

    public void listarProdutos() {
        System.out.println("Produtos no pedido:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " - ID: " + produto.getId() + ", Preço: R$ " + produto.getPreco());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Coca-Cola", 5.99);
        Produto produto2 = new Produto(2, "Cerveja", 4.99);
        Produto produto3 = new Produto(3, "Biscoito", 2.99);

        Pedido pedido = new Pedido(104, "01/01/2020");
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        System.out.println("Pedido N°: " + pedido.getNumero());
        System.out.println("Data do Pedido: " + pedido.getData());
        pedido.listarProdutos(); // Exibe os produtos do pedido
    }
}