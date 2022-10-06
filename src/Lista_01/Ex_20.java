package Lista_01;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        String cidade; 
        int consumo, renda;;

        System.out.println("Digite a primeira letra da cidade: ");
        cidade = sc.nextLine();

        System.out.println("Digite a renda da família: ");
        renda = sc.nextInt();

        System.out.println("Digite o consumo mensal de energia: ");
        consumo = sc.nextInt();

        if (renda < 0 || consumo < 0){
            System.out.println("Renda ou consumo não podem ser negativos!");
        }
        if (renda > 1000){
            System.out.println("Sem desconto para essa faixa salarial. O valor a ser pago deverá ser de R$" + consumo);
        }

        if (cidade.contains("S") || cidade.contains("s") && renda > 50 && renda < 500){
            System.out.println(consumo - 50);
        } else if (cidade.contains("S") || cidade.contains("s") && renda > 50 && renda < 500){
            System.out.println(consumo - 25); 
        }

        if (cidade.contains("I") || cidade.contains("i") && renda > 50 && renda < 500){
            System.out.println(consumo - 50);
        } else if (cidade.contains("I") || cidade.contains("i") && renda > 500 && renda < 1000){
            System.out.println(consumo - 25); 
        }

        if (cidade.contains("T") || cidade.contains("t") && renda > 50 && renda < 500){
            System.out.println(consumo - 50);
        } else if (cidade.contains("T") || cidade.contains("t") && renda > 500 && renda < 1000){
            System.out.println(consumo - 25); 
        }        
        sc.close();
	}

}
