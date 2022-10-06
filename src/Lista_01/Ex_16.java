package Lista_01;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int popA, popB, anos;

        System.out.println("Qual a população do país A?");
        popA = sc.nextInt();

        System.out.println("Qual a população do país B?");
        popB = sc.nextInt();
        
        anos = 0;
        while (popB>popA){

            popA += 0.03*popA;
            popB += 0.015*popB;
            anos++;
        }        
        System.out.println("A população A superará a população B em " + anos + "");

        sc.close();
	}

}
