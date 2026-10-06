package roman.converter.number;

public class RomanConverter {

    private static final int[] VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] SYMBOLS = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    /**
     * Convierte un número entero (arábigo) a su representación en números romanos.
     *
     * @param number El número a convertir (debe estar entre 1 y 3999).
     * @return El número en formato romano (String).
     * @throws IllegalArgumentException si el número está fuera del rango.
     */
    public String convertToRoman(int number) {
        
    }
}
