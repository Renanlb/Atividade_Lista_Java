package Lista_01;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);

        String nome;
        double salarioFixo, salarioMes, vendasMes;            
        
        System.out.println("Qual o nome do funcionário?");
        nome = sc.nextLine();

        System.out.println("Qual foi a quantidade de vendas realizadas no mês (em dinheiro)?");
        vendasMes = sc.nextDouble();

        System.out.println("Qual o salário fixo do vendedor?");
        salarioFixo = sc.nextDouble();

        salarioMes = salarioFixo + vendasMes + 0.15*vendasMes ;

        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário fixo do vendedor: R$%.2f", salarioFixo);
        System.out.printf("\nO vendedor recebeu um salário de R$%.2f", salarioMes, " ao final do mês");

        sc.close();

	}

}
