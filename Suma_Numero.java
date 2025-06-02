public class Suma_Numero {
    int numero = 0;

    public int suma() {
        if (numero == 5) {
            return numero;
        } else {
            numero++; // Incrementar antes de llamar recursivamente
            return suma();
        }
    }

    public static void main(String[] args) {
        Suma_Numero obj = new Suma_Numero();
        int resultado = obj.suma();
        System.out.println("Resultado: " + resultado);
    }
}
