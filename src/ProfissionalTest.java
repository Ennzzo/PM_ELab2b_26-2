import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals(0.0, aulas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test
    void testaPagamentoRegistrado() {
        // Arrange
        Personal personal = new Personal("Luiz", "P002");
        // Act — troque/complete conforme a classe escolhida
        double total = personal.registrarPagamento();
        // Assert
        assertEquals(3627.0, total, 0.01, "Seu pagamento registrado esta correto");
    }

    @Test
    void naoAdicionaValorNegativo() {
        // Arrange
        Personal personal = new Personal("Joao", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(-22);
        // Assert
        assertEquals(0, aulas, 0.01, "Deve retornar 0, já que nao devem ser criadas aulas avulsas");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
