package br.senai.sp.jandira.Model;

public class Animal {
    private String nome;
    private int idade;
    private char sexo;
    private String identificacaoUnica;

    public Animal(String nome, int idade, char sexo, String identificacaoUnica) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.identificacaoUnica = identificacaoUnica;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getIdentificacaoUnica() {
        return identificacaoUnica;
    }
}
