package org.example;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    public void imprimirResumoDepreciacao() {
        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. Não foi possível imprimir resumo de depreciação.");
            return; // é usado para sair do metodo, não exutando nenhuma outra linha de codigo após o return
        }

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    public double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }

    public int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    public double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
