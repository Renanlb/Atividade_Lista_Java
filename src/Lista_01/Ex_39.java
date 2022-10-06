package Lista_01;

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Informe um número para a sua tabuada: ");
		n = sc.nextInt(); 
		
		for(i = 0; i < 10; i++) {
			
			System.out.printf(" %d * %d = %d \n", i, n, (i * n));
		}
	}

}
