package Lista_01;

import java.util.Scanner;

public class Ex_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		long m = 0; 
		long n = 0; 
		
		long[] fat = new long[21];
		
		fat[0] = 1; 
		
		for(int i = 1; i <= 1; i++) {
			
			System.out.println("Informe o valor de M: "); 
			m = sc.nextLong(); 
			
			System.out.println("Informe o valor de N: ");
			n = sc.nextLong();
		}
		
		for(int i = 1; i <= 20; i++) {
			
			fat[i] = fat[i-1]*i;
		}
		
		System.out.println(fat[(int) m] + fat[(int) n]);
	}

}
