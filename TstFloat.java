// Augusto da Silva de Sá - RA: 2564319
public class TstFloat {
    // i) Classe Float: método toHexString(float f) e parseFloat(String)
    // ii) Este método converte o valor recebido em String para float, e de float para sua representação em String hexadecimal.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Float.html#toHexString(float)
    public void FloatToHex() {
        Leitura l1 = Leitura.geraLeitura();
        float f = Float.parseFloat(l1.entDados("\nDigite um valor (float): "));
        String hex = Float.toHexString(f);
        System.out.println("\nRepresentação hexadecimal: "+hex);
    }

    // i) Classe Float: método sum(float a, float b) e parseFloat(String)
    // ii) Este método soma dois valores float, calcula a média e imprime ambos.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Float.html#sum(float,float)
    public void FloatSomaEMedia() {
        Leitura l1 = Leitura.geraLeitura();
        float a = Float.parseFloat(l1.entDados("\nDigite o primeiro valor (float): "));
        float b = Float.parseFloat(l1.entDados("\nDigite o segundo valor (float): "));
        
        float soma = Float.sum(a, b);
        float media = soma / 2;
        System.out.println("\nSoma: "+soma);
        System.out.println("\nMédia: "+media);
    }
}
