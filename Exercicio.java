import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j; 
        float mult = 0;
        char operacao;

        System.out.print("Informe o primeiro valor inteiro:");
        i = sc.nextInt();

        System.out.print("Informe o segundo valor inteiro:");
        j = sc.nextInt();
        boolean valida;

        do{
            System.out.println("Qual operacao deseja realizar?");
            operacao = sc.next().charAt(0);
            valida = true;
            switch (operacao) {
                    case '+':
                         mult = i + j;
                        break;
                    case '-':
                        mult = i - j;
                        break;
                    case '*':
                        mult = i * j;
                        break;   
                    case '/':
                        mult = (float)i / j;
                        break;
                    default:
                    System.out.println("Operacao invalida - Tente Novamente");
                    valida = false;
            }
        }while(valida == false);
        
        System.out.println("O resultado das operacao e: " + mult);
        sc.close();
    }
}
