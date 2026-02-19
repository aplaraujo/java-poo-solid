import org.example.FaixaDeRisco;
import org.example.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PacienteTest {
    @Test
    @DisplayName("Deve calcular o IMC corretamente")
    public void deveCalcularIMCCorretamente() {
        // Given
        Paciente p = new Paciente("Mariazinha", 50, 1.55);
        double esperado = 20.8;

        Assertions.assertEquals(esperado, p.calcularIMC());
    }

    @Test
    @DisplayName("Deve retornar abaixo do peso ideal")
    public void deveRetornarAbaixoDoPesoIdeal() {
        // Given
        Paciente p = new Paciente("Mariazinha", 40, 1.55);
        FaixaDeRisco esperado = FaixaDeRisco.ABAIXO_DO_PESO;

        Assertions.assertEquals(esperado, p.getFaixaDeRisco());
    }


}
