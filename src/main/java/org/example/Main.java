package org.example;

public class Main {
    public static void main(String[] args) {
        var novoVisitante = new Visitante(); // var como inferencia

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria(); // var como inferencia
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
    }
}