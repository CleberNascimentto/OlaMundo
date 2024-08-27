import java.util.Scanner;
public class LeitorTeclado {

    public static void main(String [] args)
    {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o seu nome:");
        String nome = teclado.nextLine();
    
        System.out.println("Digite a sua idade e a sua altura:");
        int idade = teclado.nextInt();
        float altura = teclado.nextFloat();
        
        System.out.println("nome: " + nome);
        System.out.println("Sua idade é " + idade + ", e sua altura " + altura);

        teclado.close();
    }
}