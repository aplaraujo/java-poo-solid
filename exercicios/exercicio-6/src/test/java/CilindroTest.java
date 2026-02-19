import org.example.Cilindro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CilindroTest {

    Cilindro cilindro;

    @BeforeEach
    void setUp() {
        cilindro = new Cilindro();
    }

    @Test
    @DisplayName("A área lateral do cilindro deve ser 628.0")
    public void testAreaLateral_shouldReturn628() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 628.0;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaLateral());
    }

    @Test
    @DisplayName("A área total do cilindro deve ser 1256.0")
    public void testAreaTotal_shouldReturn1256() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 1256.0;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaTotal());
    }

    @Test
    @DisplayName("O volume do cilindro deve ser 3140.0")
    public void testAreaTotal_shouldReturn3140() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 3140.0;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.volume());
    }

    @Test
    @DisplayName("A área lateral do cilindro deve ser 251.20000000000002")
    public void testAreaLateral_shouldReturn251Point20000000000002() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 251.20000000000002;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaLateral());
    }

    @Test
    @DisplayName("A área total do cilindro deve ser 408.20000000000005")
    public void testAreaTotal_shouldReturn408Point20000000000005() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 408.20000000000005;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaTotal());
    }

    @Test
    @DisplayName("O volume do cilindro deve ser 628.0")
    public void testAreaTotal_shouldReturn628() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 628.0;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.volume());
    }

    @Test
    @DisplayName("A área lateral do cilindro deve ser 50.24")
    public void testAreaLateral_shouldReturn50Point24() {
        // Given
        double raio = 2;
        double altura = 4;
        double esperado = 50.24;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaLateral());
    }

    @Test
    @DisplayName("A área total do cilindro deve ser 75.36")
    public void testAreaTotal_shouldReturn75Point36() {
        // Given
        double raio = 2;
        double altura = 4;
        double esperado = 75.36;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.areaTotal());
    }

    @Test
    @DisplayName("O volume do cilindro deve ser 50.24")
    public void testAreaTotal_shouldReturn50Point24() {
        // Given
        double raio = 2;
        double altura = 4;
        double esperado = 50.24;

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        assertEquals(esperado, cilindro.volume());
    }

    @Test
    @DisplayName("Deve lançar uma exceção ao receber valores negativos")
    public void shouldReturnRuntimeExceptionInCaseOfNegativeValues() {
        // Given
        double raio = -2;
        double altura = -4;
        var message = "O raio e a altura não podem ser negativos";

        // When
        cilindro.setRaio(raio);
        cilindro.setAltura(altura);

        // Then
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("O raio e a altura não podem ser negativos");
        });

    }
}
