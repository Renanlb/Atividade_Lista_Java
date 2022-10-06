package Lista_01;

import java.util.Scanner;

public class Ex_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: "); 
		A = sc.nextDouble(); 
		
		System.out.println("Informe o segundo valor: "); 
		B = sc.nextDouble(); 
		
		p = ((B * 100 / A) - 100.00);
		
		System.out.println(p + "%");			
	}

}
