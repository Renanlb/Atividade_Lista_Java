package Lista_01;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        int distancia;
        double combustivelGasto, consumoMedio;

        System.out.println("Qual foi a distância percorrida?");
        distancia = sc.nextInt();

        System.out.println("Qual foi a quantidade de combustível gasto?");
        combustivelGasto = sc.nextDouble();

        consumoMedio = distancia/combustivelGasto;

        System.out.printf("Consumo médio = %.1f km/l", consumoMedio);
        
        sc.close();
	}

}
