package org.example;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.alterarCustoEmbalagem(12);
        produto2.alterarCustoEmbalagem(20);

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}