import org.example.Retangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RetanguloTest {
    @Test
    @DisplayName("A área do retângulo deve ser 260.8")
    public void shouldReturn260Point8() {
        // Given
        Retangulo retangulo = new Retangulo(23.77, 10.97);
        double esperado = 260.8;

        // Then
        Assertions.assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 240.0")
    public void shouldReturn240() {
        // Given
        Retangulo retangulo = new Retangulo(20.0, 12.0);
        double esperado = 240.0;

        // Then
        Assertions.assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 1710.0")
    public void shouldReturn1710() {
        // Given
        Retangulo retangulo = new Retangulo(45.0, 38.0);
        double esperado = 1710.0;

        // Then
        Assertions.assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 12600.0")
    public void shouldReturn12600() {
        // Given
        Retangulo retangulo = new Retangulo(140.0, 90.0);
        double esperado = 12600.0;

        // Then
        Assertions.assertEquals(esperado, retangulo.area());
    }

    @Test
    @DisplayName("A área do retângulo deve ser 120.0")
    public void shouldReturn120() {
        // Given
        Retangulo retangulo = new Retangulo(15.0, 8.0);
        double esperado = 120.0;

        // Then
        Assertions.assertEquals(esperado, retangulo.area());
    }
}
