package org.example;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado <= 25;
    }
}
