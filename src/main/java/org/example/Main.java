package org.example;

public class Main {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();
//        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(100); // Alterando variaveis de instancia pelo metodo de instancia

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
    }
}