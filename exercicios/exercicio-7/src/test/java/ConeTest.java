import org.example.Cone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConeTest {

    Cone cone = new Cone();

    @Test
    @DisplayName("A geratriz do cone deve ser 14.142135623730951")
    public void shouldReturn14Point142135623730951() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 14.142135623730951;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.geratriz());
    }

    @Test
    @DisplayName("A área lateral do cone deve ser 444.0630585851519")
    public void shouldReturn444Point0630585851519() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 444.0630585851519;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.areaLateral());
    }

    @Test
    @DisplayName("A área total do cone deve ser 758.0630585851519")
    public void shouldReturn758Point0630585851519() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 758.0630585851519;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.areaTotal());
    }

    @Test
    @DisplayName("O volume do cone deve ser 1046.6666666666667")
    public void shouldReturn1046Point6666666666667() {
        // Given
        double raio = 10;
        double altura = 10;
        double esperado = 1046.6666666666667;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.volume());
    }

    @Test
    @DisplayName("A geratriz do cone deve ser 9.433981132056603")
    public void shouldReturn9Point433981132056603() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 9.433981132056603;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.geratriz());
    }

    @Test
    @DisplayName("A área lateral do cone deve ser 148.11350377328867")
    public void shouldReturn148Point11350377328867() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 148.11350377328867;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.areaLateral());
    }

    @Test
    @DisplayName("A área total do cone deve ser 226.6135037732887")
    public void shouldReturn226Point6135037732887() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 226.6135037732887;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.areaTotal());
    }

    @Test
    @DisplayName("O volume do cone deve ser 209.33333333333334")
    public void shouldReturn209Point33333333333334() {
        // Given
        double raio = 5;
        double altura = 8;
        double esperado = 209.33333333333334;

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        Assertions.assertEquals(esperado, cone.volume());
    }

    @Test
    @DisplayName("Deve lançar uma exceção ao receber valores negativos")
    public void should_assert_a_behaviour() {
        // Given
        double raio = -5;
        double altura = -8;
        var message = "O valores do raio e da altura não devem ser negativos";

        // When
        cone.setRaio(raio);
        cone.setAltura(altura);

        // Then
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Os valores do raio e da altura não devem ser negativos");
        });
    }
}
