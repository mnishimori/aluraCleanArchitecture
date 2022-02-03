package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void deveLancarExcecaoEmailInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("marcelogmail.com"));
    }

    @Test
    void deveConstruirObjetoEmailComEnderecoEmailValido() {
        Email email = new Email("marcelo@email.com");

        assertEquals("marcelo@email.com", email.getEndereco());
    }
}