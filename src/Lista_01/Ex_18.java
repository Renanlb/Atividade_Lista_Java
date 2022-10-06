package Lista_01;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

        int numeroInvertido, entrada;

        System.out.println("Digite um número de entrada: ");
        entrada = sc.nextInt();

        numeroInvertido = 0;

        while (entrada > 0){
            numeroInvertido = numeroInvertido * 10;
            numeroInvertido = numeroInvertido + (entrada%10);
            entrada = entrada / 10;
        }
        System.out.println("O número invertido é " + numeroInvertido);
        sc.close();
	}

}
