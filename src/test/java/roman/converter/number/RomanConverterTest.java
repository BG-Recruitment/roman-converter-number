package roman.converter.number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

    private RomanConverter converter;

    @BeforeEach
    void setUp() {
        converter = new RomanConverter();
    }

    @ParameterizedTest(name = "Convertir {0} debería dar {1}")
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "5, V",
        "10, X",
        "50, L",
        "100, C",
        "500, D",
        "1000, M"
    })
    void testUnidadesYValoresBasicos(int input, String expected) {
        assertEquals(expected, converter.convertToRoman(input));
    }

    @ParameterizedTest(name = "Convertir caso sustractivo {0} debería dar {1}")
    @CsvSource({
        "4, IV",
        "9, IX",
        "40, XL",
        "90, XC",
        "400, CD",
        "900, CM"
    })
    void testNotacionSustractiva(int input, String expected) {
        assertEquals(expected, converter.convertToRoman(input));
    }

    @ParameterizedTest(name = "Convertir número complejo {0} debería dar {1}")
    @CsvSource({
        "8, VIII",
        "29, XXIX",
        "77, LXXVII",
        "444, CDXLIV",
        "1994, MCMXCIV",
        "3999, MMMCMXCIX"
    })
    void testNumerosComplejosYCompuestos(int input, String expected) {
        assertEquals(expected, converter.convertToRoman(input));
    }

    @Test
    void testNumerosFueraDeRangoLanzanExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertToRoman(0),
                "Debería fallar para números menores a 1");

        assertThrows(IllegalArgumentException.class, () -> converter.convertToRoman(4000),
                "Debería fallar para números mayores a 3999");

        assertThrows(IllegalArgumentException.class, () -> converter.convertToRoman(-15),
                "Debería fallar para números negativos");
    }
}
