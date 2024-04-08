public class ContadorPalabras {
    public static int contadorPalabras (String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] palabras = text.split("\\s+");
        return palabras.length;
    }
}

