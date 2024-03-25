package org.example;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 20; // Atributos de Classe

//        ERRADO - chamada de atributos de classe pelo objeto
//        produto1.custoEmbalagem = 10;
//        produto2.custoEmbalagem = 15;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}