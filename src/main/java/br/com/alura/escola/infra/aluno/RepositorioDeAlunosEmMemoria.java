package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    @Override
    public void matricular(Aluno aluno) {

    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
