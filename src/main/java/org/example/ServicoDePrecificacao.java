package org.example;

public class ServicoDePrecificacao {
    void calcularPrecoVenda(double precoCusto) {
        // adiciona 20% de margem de lucro
        precoCusto = precoCusto * 1.20; // não funciona, pois tipos primitivos apenas copiam o valor e não referencia

        // faz várias outras coisas
    }
}
