package Lista_01;

import java.util.Scanner;

public class Ex_50 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int andar = 0;
		int contador = 0;
		int numero; 
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt(); 
		
		while(contador < numero) {
			
			andar++; 
			contador++;
			
			while(Integer.toString(andar).contains("4") || Integer.toString(andar).contains("13")) {
				
				andar++;
			}
		}
		
		System.out.println("Posição: " + andar);
	}

}
