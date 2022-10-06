package Lista_01;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);                        
        sc.close();

        int entrada,x;

        System.out.println("Digite um número: ");
        entrada = sc.nextInt();

        if (entrada%2==0){
            System.out.println("Os 6 números ímpares após o " + entrada + " são:");
            for (x = entrada + 1; x <= entrada + 12; x = x + 2)
            System.out.println(x);
        } else {
            System.out.println("Os 6 números ímpares após o " + entrada + " são:");
            for (x = entrada + 2; x <= entrada + 12; x = x + 2)
            System.out.println(x);
        } 

	}

}
