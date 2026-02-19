import org.example.Paralelepipedo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParalelepipedoTest {

    Paralelepipedo paralelepipedo;

    @BeforeEach
    void setUp() {
        paralelepipedo = new Paralelepipedo();
    }

    @Test
    @DisplayName("A área do paralelepípedo deve ser 1840.0")
    public void testArea_ShouldReturn1840() {
        // Given
        double altura = 26;
        double largura = 12;
        double comprimento = 16;
        double esperado = 1840.0;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.area());
    }

    @Test
    @DisplayName("O volume do paralelepípedo deve ser 4992.0")
    public void testArea_ShouldReturn4992() {
        // Given
        double altura = 26;
        double largura = 12;
        double comprimento = 16;
        double esperado = 4992.0;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.volume());
    }

    @Test
    @DisplayName("A área do paralelepípedo deve ser 347.5")
    public void testArea_ShouldReturn347Point5() {
        // Given
        double altura = 12;
        double largura = 3.5;
        double comprimento = 8.5;
        double esperado = 347.5;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.area());
    }

    @Test
    @DisplayName("O volume do paralelepípedo deve ser 357.0")
    public void testArea_ShouldReturn357() {
        // Given
        double altura = 12;
        double largura = 3.5;
        double comprimento = 8.5;
        double esperado = 357.0;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.volume());
    }

    @Test
    @DisplayName("A área do paralelepípedo deve ser 22.08")
    public void testArea_ShouldReturn22Point080000000000002() {
        // Given
        double altura = 1.8;
        double largura = 1.6;
        double comprimento = 2.4;
        double esperado = 22.080000000000002;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.area());
    }

    @Test
    @DisplayName("O volume do paralelepípedo deve ser 6.912")
    public void testArea_ShouldReturn6Point912() {
        // Given
        double altura = 1.8;
        double largura = 1.6;
        double comprimento = 2.4;
        double esperado = 6.912;

        // When
        paralelepipedo.setAltura(altura);
        paralelepipedo.setLargura(largura);
        paralelepipedo.setComprimento(comprimento);

        // Then
        Assertions.assertEquals(esperado, paralelepipedo.volume());
    }
}
