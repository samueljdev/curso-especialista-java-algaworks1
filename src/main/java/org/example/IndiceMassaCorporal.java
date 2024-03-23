package org.example;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    // exemplos de metodos a serem criados
    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }
}
