package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

// entidade
public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public void adicionarTelefone(String ddd, String numero) {
        telefones.add(new Telefone(ddd, numero));
    }

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
