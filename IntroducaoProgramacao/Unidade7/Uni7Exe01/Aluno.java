package Unidade7.Uni7Exe01;

public class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    String situacao() {
        if (nota >= 7.0) {
            return "Aprovado";
        } else if (nota >= 4.0 && nota < 7.0) {
            return "Recuperação";
        } else if (nota < 4.0) {
            return "Reprovado";
        }
        return "";
    }
}
