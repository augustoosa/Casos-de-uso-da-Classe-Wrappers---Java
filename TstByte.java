// Augusto da Silva de Sá - RA: 2564319
public class TstByte {
    // i) Classe Byte: método parseByte(String s)
    // ii) Este método converte uma String em byte e verifica se o valor resultante é par ou ímpar.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Byte.html#parseByte(java.lang.String)
    public void ByteParOuImpar() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor byte: ");
        byte b = Byte.parseByte(s);
        if (b % 2 == 0) {
            System.out.println("\nO valor é par.\n");
        } else {
            System.out.println("\nO valor é ímpar.\n");
        }
    }

    // i) Classe Byte: método decode(String nm)
    // ii) Este método converte uma String (decimal, hexadecimal ou octal) em byte e imprime o resultado.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Byte.html#decode(java.lang.String)
    public void ByteDecode() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor em codificado em decimal, hexadecimal ou octal (ex.: 123, 0x7B, 0173): ");
        byte b = Byte.decode(s);
        System.out.println("\nValor decodificado para byte: " + b);
    }
}