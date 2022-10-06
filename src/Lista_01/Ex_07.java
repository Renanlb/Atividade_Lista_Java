package Lista_01;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        int entrada, resultado, resto100, resto50, resto20, resto10, resto5, resto2;

	        System.out.println("Informe um número: ");

	        entrada = sc.nextInt();

	        resultado = entrada/100; 
	        resto100 = entrada%100;  

	        System.out.println(resultado + " nota(s) de R$100,00");

	        resultado = resto100/50;
	        resto50 = resto100%50;
	          
	        System.out.println(resultado + " nota(s) de R$50,00");

	        resultado = resto50/20;
	        resto20 = resto50%20;
	          
	        System.out.println(resultado + " nota(s) de R$20,00");

	        resultado = resto20/10;
	        resto10 = resto20%10;
	          
	        System.out.println(resultado + " nota(s) de R$10,00");

	        resultado = resto10/5;
	        resto5 = resto10%5;
	          
	        System.out.println(resultado + " nota(s) de R$5,00");

	        resultado = resto5/2;
	        resto2 = resto5%2;
	          
	        System.out.println(resultado + " nota(s) de R$2,00");

	        resultado = resto2/1;
	          
	        System.out.println(resultado + " nota(s) de R$1,00");

	        sc.close();

	}

}
