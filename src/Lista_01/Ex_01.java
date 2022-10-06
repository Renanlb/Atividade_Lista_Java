package Lista_01;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);        
        double notaA, notaB, media;        
        
        System.out.println("Calculando a média dos alunos");

        System.out.println("Insira a primeira nota: ");
        notaA = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        notaB = sc.nextDouble();

        media = (notaA * 3.5 + notaB * 7.5) / 11;

        System.out.printf("Média: %.2f", media);

        if (media >= 7){
        	
            System.out.println("\nAprovado!");
            
        } else {
        	
            System.out.println("\nReprovado! "); 
            
        } 
        
        sc.close();     
	}

}
