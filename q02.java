/*2. Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência; */
import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salaMin, quantQuilowatt;
        float valorQuiwatt = 0, valorPaResid = 0;

        System.out.print("Informe o salario minimo:");
        salaMin = sc.nextFloat();

        System.out.print("Informe a quantidade de quilowatts consumida:");
        quantQuilowatt = sc.nextFloat();

        valorQuiwatt = salaMin * 0.01f;
        valorPaResid = quantQuilowatt * valorQuiwatt;

        System.out.println("O valor de cada quilowatt e de:"+  valorQuiwatt +"W.");
        System.out.println("E o valor a ser pago pela residencia sera de:"+valorPaResid+"reais.");
        sc.close();
        
    }
}
