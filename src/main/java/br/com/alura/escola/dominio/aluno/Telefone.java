package br.com.alura.escola.dominio.aluno;

// value object
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || ddd.trim().isEmpty() || !ddd.matches("[0-9]{2}")) {
            throw new IllegalArgumentException("ddd inválido");
        }
        if (numero == null
                || numero.trim().isEmpty()
                || !numero.matches("[0-9]{4}-[0-9]{4}")
                || !numero.matches("[0-9]{5}-[0-9]{4}")) {
            throw new IllegalArgumentException("ddd inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
