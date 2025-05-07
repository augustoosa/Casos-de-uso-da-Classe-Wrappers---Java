// Augusto da Silva de Sá - RA: 2564319
public class TstWrapMenu {
    public static void main(String[] args) {
        Leitura l1 = Leitura.geraLeitura();
        

        // Instanciando todas as classes
        
        TstInt tInt = new TstInt();
        TstBool tBool = new TstBool();
        TstChar tChar = new TstChar();
        TstDoub tDoub = new TstDoub();
        TstByte tByte = new TstByte();
        TstShort tShort = new TstShort();
        TstFloat tFloat = new TstFloat();
        TstLong tLong = new TstLong();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU WRAPPER ---");
            System.out.println("1) Integer");
            System.out.println("2) Boolean");
            System.out.println("3) Character");
            System.out.println("4) Double");
            System.out.println("5) Byte");
            System.out.println("6) Short");
            System.out.println("7) Float");
            System.out.println("8) Long");
            System.out.println("0) Sair\n");
            
            opcao = Integer.parseInt(l1.entDados("Escolha uma opção (de 0 a 7): "));
            
            switch (opcao) {
                case 1: 
                    tInt.IntMaiorMenorIgual();
                    tInt.IntPositivoNegativoZero();
                    break;
                case 2: 
                    tBool.CompararBooleanos();
                    tBool.OrBooleano();
                    break;
                case 3: 
                    tChar.NumeroLetraOuEspaco();
                    tChar.MaiusculoOuMinusculo();
                    break;
                case 4: 
                    tDoub.CompararDoubles();
                    tDoub.MédiaDouble();
                    break;
                case 5: 
                    tByte.ByteDecode();
                    tByte.ByteParOuImpar();
                    break;
                case 6: 
                    tShort.ShortInvertByte();
                    tShort.ShortPosNegOuZero();
                    break;
                case 7: 
                    tFloat.FloatSomaEMedia();
                    tFloat.FloatToHex();
                    break;
                case 8: 
                    tLong.LongBinarioInvertido();
                    tLong.LongNumeroBits();
                    break;
                case 0:  
                    break;
            }
        }
    }
}