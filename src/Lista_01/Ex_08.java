package Lista_01;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        double rendaHomem, rendaMulher, rendaConjunta, rendaLiquida1, rendaLiquida2,rendaLiquida3, IR1, IR2, IR3;

	        System.out.println("Qual a renda do homem? ");
	        rendaHomem = sc.nextDouble();

	        System.out.println("Qual a renda da mulher? ");
	        rendaMulher = sc.nextDouble();

	        rendaConjunta = rendaHomem + rendaMulher;

	        IR1 = 0.1 * rendaConjunta;
	        IR2  = 0.15 * rendaConjunta;
	        IR3 = 0.25 * rendaConjunta;

	        rendaLiquida1 =  rendaConjunta - IR1;
	        rendaLiquida2 =  rendaConjunta - IR2;
	        rendaLiquida3 =  rendaConjunta - IR3;


	        if (rendaConjunta < 900){
	            
	            System.out.println("Renda conjunta: " + rendaConjunta);
	            System.out.println("Isento de imposto de renda");

	        } else if (rendaConjunta > 900.01 && rendaConjunta < 1500){
	        
	                System.out.println("Renda conjunta: " + rendaConjunta);
	                System.out.println("Alíquota utilizada: 10%");
	                System.out.println("Imposto de renda: " + IR1);
	                System.out.println("Renda líquida: " + rendaLiquida1);

	            } else if (rendaConjunta > 1500.01 && rendaConjunta < 2500){

	                    System.out.println("Renda conjunta: " + rendaConjunta);
	                    System.out.println("Alíquota utilizada: 15%");
	                    System.out.println("Imposto de renda: " + IR2);
	                    System.out.println("Renda líquida: " + rendaLiquida2);

	                } else if (rendaConjunta > 2500){
	   
	                        System.out.println("Renda conjunta: " + rendaConjunta);
	                        System.out.println("Alíquota utilizada: 25%");
	                        System.out.println("Imposto de renda: " + IR3);
	                        System.out.println("Renda líquida: " + rendaLiquida3);
	                    }
	        sc.close();
	}

}
