package org.example;

public class Main {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        double peso = 75;
        double altura = 1.82;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade%n", imc.altura, imc.peso);
        } else if (imc.estaAbaixoDoPesoIdeal()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está abaixo do peso ideal %n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}