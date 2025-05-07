// Augusto da Silva de Sá - RA: 2564319
public class TstShort {
    // i) Classe Short: método parseShort(String s)
    // ii) Este método converte uma String em short e informa se o valor é negativo, zero ou positivo.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Short.html#parseShort(java.lang.String)
    public void ShortPosNegOuZero() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor short (entre -32000 e 32000): ");
        short valor = Short.parseShort(s);
        if (valor < 0) {
            System.out.println("\nO valor é negativo.\n");
        } 
        else if (valor == 0) {
            System.out.println("\nO valor é zero.\n");
        } 
        else {
            System.out.println("\nO valor é positivo.\n");
        }
    }

    // i) Classe Short: método reverseBytes(short s)
    // ii) Este método inverte a ordem dos dois bytes do valor short e imprime os valores original e invertido.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Short.html#reverseBytes(short)
    public void ShortInvertByte() {
        Leitura l1 = Leitura.geraLeitura();
        String s = l1.entDados("\nDigite um valor short (entre -32000 e 32000): ");
        short original = Short.parseShort(s);
        short invertido = Short.reverseBytes(original);
        System.out.println("\nValor original: " + original);
        System.out.println("\nValor com bytes invertidos: " + invertido);
    }
}
