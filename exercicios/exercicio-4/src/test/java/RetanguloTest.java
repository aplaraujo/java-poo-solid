import org.example.Retangulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void setUp() {
        retangulo = new Retangulo();
    }

    @Test
    @DisplayName("A área do retângulo deve ser 20.0")
    public void testArea_ShouldReturn20() {
        // Given
        double comprimento = 5.0;
        double largura = 4.0;
        double esperado = 20.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("O perímetro do retângulo deve ser 18.0")
    public void testPerimetro_ShouldReturn18() {
        // Given
        double comprimento = 5.0;
        double largura = 4.0;
        double esperado = 18.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.perimetro());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 6.0")
    public void testArea_ShouldReturn6() {
        // Given
        double comprimento = 2.0;
        double largura = 3.0;
        double esperado = 6.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("O perímetro do retângulo deve ser 10.0")
    public void testPerimetro_ShouldReturn10() {
        // Given
        double comprimento = 2.0;
        double largura = 3.0;
        double esperado = 10.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.perimetro());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 200.0")
    public void testArea_ShouldReturn200() {
        // Given
        double comprimento = 10.0;
        double largura = 20.0;
        double esperado = 200.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("O perímetro do retângulo deve ser 60.0")
    public void testPerimetro_ShouldReturn60() {
        // Given
        double comprimento = 10.0;
        double largura = 20.0;
        double esperado = 60.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.perimetro());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 8265.0")
    public void testArea_ShouldReturn8265() {
        // Given
        double comprimento = 95.0;
        double largura = 87.0;
        double esperado = 8265.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("O perímetro do retângulo deve ser 364.0")
    public void testPerimetro_ShouldReturn364() {
        // Given
        double comprimento = 95.0;
        double largura = 87.0;
        double esperado = 364.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.perimetro());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 1530.0")
    public void testArea_ShouldReturn1530() {
        // Given
        double comprimento = 34.0;
        double largura = 45.0;
        double esperado = 1530.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("O perímetro do retângulo deve ser 158.0")
    public void testPerimetro_ShouldReturn158() {
        // Given
        double comprimento = 34.0;
        double largura = 45.0;
        double esperado = 158.0;

        // When
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        // Then
        assertEquals(esperado, retangulo.perimetro());
    }
}
