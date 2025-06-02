public class Palindromo {
    public static boolean esPalindromo(String user){
        String procesado = user.replace(" ", "").toLowerCase();
        String invertida = "";
        for (int i = procesado.length() - 1; i >= 0; i--) {
            invertida += procesado.charAt(i);
        }
        return procesado.equals(invertida);
    }

    public static void main(String[] args) {
        String frase = "Amo la paloma";
        if (esPalindromo(frase)) {
            System.out.println("\"" + frase + "\" es un palíndromo");
        } else {
            System.out.println("\"" + frase + "\" no es un palíndromo");
        }
    }
}
