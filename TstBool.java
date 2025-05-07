// Augusto da Silva de Sá - RA: 2564319
public class TstBool {
    // i) Classe Boolean: método compare(boolean x, boolean y) e parseBoolean(String s)
    // ii) Este método compara dois valores booleanos e informa se são iguais,
    //     ou se x == false e y == true, ou x == true e y == false.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Boolean.html
    public void CompararBooleanos() {
        Leitura l1 = Leitura.geraLeitura();
        boolean x = Boolean.parseBoolean(l1.entDados("\nDigite um valor booleano para x (true/false): "));
        boolean y = Boolean.parseBoolean(l1.entDados("\nDigite um valor booleano para y (true/false): "));
        
        int result = Boolean.compare(x, y);
        if (result == 0) {
            System.out.println("\nx e y são iguais\n");
        } else if (result < 0) {
            System.out.println("\nx é false e y é true\n");
        } else {
            System.out.println("\nx é true e y é false\n");
        }
    }

    // i) Classe Boolean: método logicalOr(boolean a, boolean b) e parseBoolean(String s)
    // ii) Este método executa o OR lógico entre dois valores booleanos e imprime o resultado.
    // iii) Referência: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Boolean.html
    public void OrBooleano() {
        Leitura l1 = Leitura.geraLeitura();
        boolean a = Boolean.parseBoolean(l1.entDados("\nDigite true ou false para A: "));
        boolean b = Boolean.parseBoolean(l1.entDados("\nDigite true ou false para B: "));
        boolean result = Boolean.logicalOr(a, b);
        if(result==false){
            System.out.println("\nVoce nao digitou true para nenhum dos dois --- Saída lógica OR = false\n");
        }
        else{
            System.out.println("\nVoce digitou true para A e/ou true para B --- Saida lógica OR = true\n");
        }
    }
}
