import org.example.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    @Test
    @DisplayName("A área do triângulo deve ser 54.0")
    public void shouldReturn54() {
        // Given
        Triangulo triangulo = new Triangulo(12.0, 9.0);
        double esperado = 54.0;

        // Then
        Assertions.assertEquals(esperado, triangulo.area());
    }

    @Test
    @DisplayName("A área do triângulo deve ser 25.0")
    public void shouldReturn25() {
        // Given
        Triangulo triangulo = new Triangulo(10.0, 5.0);
        double esperado = 25.0;

        // Then
        Assertions.assertEquals(esperado, triangulo.area());
    }

    @Test
    @DisplayName("A área do triângulo deve ser 90.0")
    public void shouldReturn90() {
        // Given
        Triangulo triangulo = new Triangulo(15.0, 12.0);
        double esperado = 90.0;

        // Then
        Assertions.assertEquals(esperado, triangulo.area());
    }

    @Test
    @DisplayName("A área do triângulo deve ser 10.0")
    public void shouldReturn10() {
        // Given
        Triangulo triangulo = new Triangulo(4.0, 5.0);
        double esperado = 10.0;

        // Then
        Assertions.assertEquals(esperado, triangulo.area());
    }

    @Test
    @DisplayName("A área do triângulo deve ser 540.0")
    public void shouldReturn540() {
        // Given
        Triangulo triangulo = new Triangulo(30.0, 36.0);
        double esperado = 540.0;

        // Then
        Assertions.assertEquals(esperado, triangulo.area());
    }


}
