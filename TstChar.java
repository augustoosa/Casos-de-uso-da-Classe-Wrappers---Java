// Augusto da Silva de Sá - RA: 2564319
public class TstChar {
    // i) Classe Character: métodos isDigit(char ch), isLetter(char ch) e isWhitespace(char ch) e charAt(0)
    // ii) Este método verifica se o caractere digitado é numero, letra ou espaço em branco.
    // iii) Usa String.charAt(int index) para extrair o caractere da entrada.
    // iv) Referências:
    //     - Character: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html
    //     - String.charAt: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#charAt(int)
    public void NumeroLetraOuEspaco() {
        Leitura l1 = Leitura.geraLeitura();
        String entrada = l1.entDados("\nDigite um caractere (uma letra, um numero ou um espaco em branco): ");
        char ch = entrada.charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("\nO caractere é um dígito.\n");
        } 
        else if (Character.isLetter(ch)) {
            System.out.println("\nO caractere é uma letra.\n");
        } 
        else{
            System.out.println("\nO caractere é um espaço em branco.\n");
        }
    }

    // i) Classe Character: método toUpperCase(char ch)
    // ii) Este método verifica se o caractere digitado é maiúsculo ou minúsculo.
    // iii) Usa String.charAt(int index) para extrair o caractere da entrada.
    // iv) Referências:
    //     - Character: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html
    //     - String.charAt: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#charAt(int)
    public void MaiusculoOuMinusculo() {
        Leitura l1 = Leitura.geraLeitura();
        String entrada = l1.entDados("\nDigite um caractere maiusculo ou minusculo: ");
        char ch = entrada.charAt(0);

        // converte para maiúsculo e compara
        char upper = Character.toUpperCase(ch);
        if (ch == upper) {
            System.out.println("\nO caractere é MAIÚSCULO.\n");
        } 
        else {
            System.out.println("\nO caractere é minúsculo.\n");
        }
    }
}
