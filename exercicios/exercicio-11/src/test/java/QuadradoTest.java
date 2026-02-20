import org.example.Quadrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    @DisplayName("A área do quadrado deve ser 144.0")
    public void shouldReturn144() {
        // Given
        Quadrado quadrado = new Quadrado(12.0);
        double esperado = 144.0;

        // Then
        Assertions.assertEquals(esperado, quadrado.area());
    }

    @Test
    @DisplayName("A área do quadrado deve ser 36.0")
    public void shouldReturn36() {
        // Given
        Quadrado quadrado = new Quadrado(6.0);
        double esperado = 36.0;

        // Then
        Assertions.assertEquals(esperado, quadrado.area());
    }

    @Test
    @DisplayName("A área do quadrado deve ser 25.0")
    public void shouldReturn25() {
        // Given
        Quadrado quadrado = new Quadrado(5.0);
        double esperado = 25.0;

        // Then
        Assertions.assertEquals(esperado, quadrado.area());
    }

    @Test
    @DisplayName("A área do quadrado deve ser 100.0")
    public void shouldReturn100() {
        // Given
        Quadrado quadrado = new Quadrado(10.0);
        double esperado = 100.0;

        // Then
        Assertions.assertEquals(esperado, quadrado.area());
    }

    @Test
    @DisplayName("A área do quadrado deve ser 16.0")
    public void shouldReturn16() {
        // Given
        Quadrado quadrado = new Quadrado(4.0);
        double esperado = 16.0;

        // Then
        Assertions.assertEquals(esperado, quadrado.area());
    }
}
