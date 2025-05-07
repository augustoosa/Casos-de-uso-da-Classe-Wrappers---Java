// Augusto da Silva de Sá - RA: 2564319
public class TstLong {
    // i) Classe Long: métodos parseLong(String s), toBinaryString(long i) e reverse(long i)
    // ii) Este método lê um valor long, mostra sua representação binária, inverte todos os bits
    //     e imprime o valor resultante e sua representação binária.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Long.html
    public void LongBinarioInvertido() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor (long): ");
        long v = Long.parseLong(s);

        String bin = Long.toBinaryString(v);
        long rev = Long.reverse(v);
        String revBin = Long.toBinaryString(rev);

        System.out.println("\nBinário: "+ bin);
        System.out.println("\nValor com bits invertidos: "+ rev);
        System.out.println("\nBinário invertido: "+ revBin);
    }

    // i) Classe Long: métodos parseLong(String s), toBinaryString(long i) e bitCount(long i)
    // ii) Este método lê um valor long, mostra sua representação binária e conta quantos bits '1' há.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Long.html
    public void LongNumeroBits() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor (long): ");
        long valor = Long.parseLong(s);

        String bin = Long.toBinaryString(valor);
        int bits = Long.bitCount(valor);

        System.out.println("\nValor: "+ valor);
        System.out.println("\nBinário: "+ bin);
        System.out.println("\nNúmero de bits '1': "+ bits);
    }
}
