package Lista_01;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        String entrada;

        System.out.println("Escolha um animal de cada classe de maneira consecutiva para identificar o animal correspondente: ");
        entrada = sc.nextLine();

        switch (entrada){
            case "vertebrado, ave e carnívoro":
            System.out.println("águia"); 
            break;
            
            case "vertebrado, ave e onívoro":
            System.out.println("pomba"); 
            break;

            case "vertebrado, mamífero e onívoro":
            System.out.println("homem"); 
            break;

            case "vertebrado, mamífero e herbívoro":
            System.out.println("vaca"); 
            break;

            case "invertebrado, inseto e hematófago":
            System.out.println("pulga"); 
            break;

            case "invertebrado, inseto e carnívoro":
            System.out.println("lagarta"); 
            break;

            case "invertebrado, anelídeo e hematófago":
            System.out.println("sanguessuga"); 
            break;

            case "invertebrado, anelídeo e onívoro":
            System.out.println("minhoca"); 
            break;
        }
        sc.close();
	}

}
