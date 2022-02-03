package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CPFTest {

    @Test
    void deveLancarExcecaoCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new CPF(null));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new CPF(""));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new CPF("111111111"));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> new CPF("11111111111"));
    }

}