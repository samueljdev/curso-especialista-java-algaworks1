package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.nome = "Samuel Lisboa";
        primeiraPessoa.cpf = "111.222.333-44";
        primeiraPessoa.anoNascimento = 1981;

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.nome = "João das Couves";
        segundaPessoa.cpf = "999.999.999-99";
        segundaPessoa.anoNascimento = 1992;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = primeiraPessoa;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = segundaPessoa;

        meuCarro.exibirDadosCarro();
        meuCarro.imprimirResumoDepreciacao();
        meuCarro.calcularValorRevenda();
        meuCarro.imprimirIpva();

        System.out.println();

        seuCarro.exibirDadosCarro();
        seuCarro.imprimirResumoDepreciacao();
        seuCarro.calcularValorRevenda();
        seuCarro.imprimirIpva();
    }
}