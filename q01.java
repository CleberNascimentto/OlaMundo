/*1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. 
Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto. */
import java.util.Scanner;

public class q01 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        float horasTrab, valorHoraTrab;
        float salaBruto = 0, salario = 0;
        float imposto = 0;

        System.out.print("Informe as horas trabalhadas: \n");
        horasTrab = sc.nextFloat(); 

        System.out.print("Informe o valor das horas trabalhadas\n");
        valorHoraTrab = sc.nextFloat();

        salaBruto = horasTrab * valorHoraTrab;
        imposto = salaBruto * (30/100);
        salario = salaBruto - imposto;

        System.out.println("O salario a receber sera de: " + salario + " reais");
        sc.close();
    }  
}
