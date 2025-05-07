//Augusto da Silva de Sá - RA: 2564319
public class TstInt {
    // i) Classe Integer: métodos compare(int x, int y) e max(int x, int y)
    // ii) Este método compara dois valores e depois imprime se o primeiro é maior, igual ou menor que o segundo.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html
    public void IntMaiorMenorIgual() {
        int x=0,y=0;
        Leitura l1 = Leitura.geraLeitura();
        x=Integer.parseInt(l1.entDados("\nEscolha um valor inteiro para x: "));
        y=Integer.parseInt(l1.entDados("\nEscolha um valor inteiro para y: "));
        
        int result = Integer.compare(x, y);
        if(result==0){
            System.out.println("\nOs dois numero sao iguais\n");
        }
        else if(result<0){
            System.out.println("\nx é menor que y\n");
        }
        else{
            System.out.println("\nx é maior que y\n");
        }
        
    }
    
    // i) Classe Integer: métodos bitCount(int i) e signum(int i)
    // ii) Este método determina se o numero é negativo, zero ou positivo.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html
    public void IntPositivoNegativoZero() {
        int i=0;
        Leitura l1 = Leitura.geraLeitura();
        i=Integer.parseInt(l1.entDados("\nDigite um numero inteiro: "));

        int sinal = Integer.signum(i);
        if(sinal==0){
            System.out.println("\nO numero é zero\n");
        }
        else if(sinal<0){
            System.out.println("\no numero é negativo\n");
        }
        else{
            System.out.println("\nO numero é positivo\n");
        }
    }
}
