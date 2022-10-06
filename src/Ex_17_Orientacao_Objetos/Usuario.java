package Ex_17_Orientacao_Objetos;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
	
	private String login;
	private String senha;
	
	private Set<Pessoa> pessoas = new HashSet<>();
}
