package org.example;

public class Main {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        // sobrecarga de metodos, usando dois metodos cadastrar
        cadastroPortaria.cadastrar(novoVisitante);
        cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}