package Lista_01;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        int numFunc, horasTrab;
        double valorPorHora;
        double salario;

        System.out.println("Qual o número do funcionário?");
        numFunc = sc.nextInt();

        System.out.println("Qual a quantidade de horas trabalhadas?");
        horasTrab = sc.nextInt();

        System.out.println("Qual o valor da hora trabalhada?");
        valorPorHora = sc.nextDouble();

        salario = horasTrab*valorPorHora;

        System.out.printf("Número do funcionário: " + numFunc);
        System.out.printf("\nSalário: R$%.2f", salario);

        sc.close();

	}

}
