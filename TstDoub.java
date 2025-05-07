// Augusto da Silva de Sá - RA: 2564319
public class TstDoub {
    // i) Classe Double: método compare(double d1, double d2)
    // ii) Este método compara dois valores double e informa se o primeiro
    //     é menor, igual ou maior que o segundo.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html#compare(double,double)
    public void CompararDoubles() {
        Leitura l1 = Leitura.geraLeitura();
        double d1 = Double.parseDouble(l1.entDados("\nDigite um valor double para d1: "));
        double d2 = Double.parseDouble(l1.entDados("\nDigite um valor double para d2: "));
        
        int result = Double.compare(d1, d2);
        if (result == 0) {
            System.out.println("\nd1 e d2 são iguais\n");
        } 
        else if (result < 0) {
            System.out.println("\nd1 é menor que d2\n");
        } 
        else {
            System.out.println("\nd1 é maior que d2\n");
        }
    }

    // i) Classe Double: método sum(double a, double b)
    // ii) Este método calcula a média de dois valores double e imprime o resultado.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html#sum(double,double)
    public void MédiaDouble() {
        Leitura l1 = Leitura.geraLeitura();
        double a = Double.parseDouble(l1.entDados("\nDigite o primeiro valor double: "));
        double b = Double.parseDouble(l1.entDados("\nDigite o segundo valor double: "));
        double soma = Double.sum(a, b);
        double media = soma / 2;
        System.out.println("\nMédia dos valores: " + media);
    }
}
