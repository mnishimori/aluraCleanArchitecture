package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TelefoneTest {

    @Test
    void lancarExcecaoTelefoneInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("aaa", "aaaa-aaaa"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "1-1"));
    }

}