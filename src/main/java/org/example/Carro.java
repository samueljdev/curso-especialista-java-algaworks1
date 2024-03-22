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

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

    public void imprimirIpva() {
        System.out.println("Calcular Ipva = " + calcularIpva());
    }

    public double calcularIpva() {
        return calcularValorRevenda() * 0.04;
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

    private int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    public void exibirDadosCarro() {
        System.out.println("------------------------------------");
        System.out.print("Meu carro");
        System.out.printf("Fabricante: %s%n", this.fabricante);
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Ano: %d%n", this.anoFabricacao);
        System.out.printf("Proprietário: %s%n", proprietario.nome);
    }
}