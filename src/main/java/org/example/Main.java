package org.example;

public class Main {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(50);

        System.out.printf("GOL (%s): %d assentos disponíveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;

        aviaoLatam.reservarAssentos(90);

        System.out.printf("LATAM (%s): %d assentos disponíveis%n",
                aviaoLatam.ativo ? "Ativo" : "Inativo", aviaoLatam.calcularAssentosDisponiveis());
    }
}