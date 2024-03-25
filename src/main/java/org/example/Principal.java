package org.example;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // Metodo de classe
        Produto.alterarCustoEmbalagem(12);
        Produto.imprimirCustoEmbalagem();
    }
}
