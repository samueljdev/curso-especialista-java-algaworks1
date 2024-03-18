package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.nome = "Samuel Lisboa";
        primeiraPessoa.cpf = "111.222.333-44";
        primeiraPessoa.anoNascimento = 1981;

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.nome = "João das Exemplo";
        segundaPessoa.cpf = "999.999.999-99";
        segundaPessoa.anoNascimento = 1992;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = primeiraPessoa;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = segundaPessoa;

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();
    }
}