public class App {
    /**
     * Pasa de Binario a Decimal 
     * @param num Numero Binario 
     * @return Numero decimal
     */
    public static int aDecimal(int num) {
        int decimal = 0;
        int digitos = Mates.digitos(num);
        for (int i = 0; i < digitos; i++) {
            int digito = Mates.digitoN(num, digitos-1-i);
            int potencia = Mates.potencia(2, i);
            decimal += digito * potencia;
        }
        return decimal;
    }

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzcae un número bineario: "));
        System.out.printf("%d en decima es %d en decimal", num, aDecimal(num));
    }

}
