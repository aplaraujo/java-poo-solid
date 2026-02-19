import org.example.Eleitor;
import org.example.TipoDeEleitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EleitorTest {

    Eleitor eleitor;

    @BeforeEach
    void setUp() {
        eleitor = new Eleitor();
    }

    @Test
    public void deveRetornarNaoEleitor() {
        // Given
        String nome = "Zequinha";
        int anoNascimento = 2016;
        TipoDeEleitor esperado = TipoDeEleitor.NAO_ELEITOR;

        // When
        eleitor.setNome(nome);
        eleitor.setAnoNascimento(anoNascimento);

        // Then
        Assertions.assertEquals(esperado, eleitor.getTipoDeEleitor());
    }

    @Test
    public void deveRetornarEleitorFacultativo() {
        // Given
        String nome = "Zequinha";
        int anoNascimento = 2009;
        TipoDeEleitor esperado = TipoDeEleitor.ELEITOR_FACULTATIVO;

        // When
        eleitor.setNome(nome);
        eleitor.setAnoNascimento(anoNascimento);

        // Then
        Assertions.assertEquals(esperado, eleitor.getTipoDeEleitor());
    }

    @Test
    public void deveRetornarEleitorObrigatorio() {
        // Given
        String nome = "Zequinha";
        int anoNascimento = 1970;
        TipoDeEleitor esperado = TipoDeEleitor.ELEITOR_OBRIGATORIO;

        // When
        eleitor.setNome(nome);
        eleitor.setAnoNascimento(anoNascimento);

        // Then
        Assertions.assertEquals(esperado, eleitor.getTipoDeEleitor());
    }



}
