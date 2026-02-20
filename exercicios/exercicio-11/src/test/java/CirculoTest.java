import org.example.Circulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    @Test
    @DisplayName("A área do círculo deve ser 113.1")
    public void shouldReturn113Point1() {
        // Given
        Circulo circulo = new Circulo(6.0);
        double esperado = 113.1;

        // Then
        Assertions.assertEquals(esperado, circulo.area());
    }

    @Test
    @DisplayName("A área do círculo deve ser 78.5")
    public void shouldReturn78Point5() {
        // Given
        Circulo circulo = new Circulo(5.0);
        double esperado = 78.5;

        // Then
        Assertions.assertEquals(esperado, circulo.area());
    }

    @Test
    @DisplayName("A área do círculo deve ser 314.2")
    public void shouldReturn314Point2() {
        // Given
        Circulo circulo = new Circulo(10.0);
        double esperado = 314.2;

        // Then
        Assertions.assertEquals(esperado, circulo.area());
    }

    @Test
    @DisplayName("A área do círculo deve ser 50.3")
    public void shouldReturn50Point3() {
        // Given
        Circulo circulo = new Circulo(4.0);
        double esperado = 50.3;

        // Then
        Assertions.assertEquals(esperado, circulo.area());
    }

    @Test
    @DisplayName("A área do círculo deve ser 452.4")
    public void shouldReturn452Point4() {
        // Given
        Circulo circulo = new Circulo(12.0);
        double esperado = 452.4;

        // Then
        Assertions.assertEquals(esperado, circulo.area());
    }
}
