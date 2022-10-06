package Lista_01;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("Maior: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("Maior: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("Maior: " + numero3);
        }

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("Menor: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3){
            System.out.println("Menor: " + numero2);
        } else if (numero3 < numero1 && numero3 < numero2){
            System.out.println("Menor: " + numero3);
        }
        sc.close(); 
        
	}

}
