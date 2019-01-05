package br.com.treinaweb.estruturasdedados.main;

import java.util.Scanner;
import br.com.treinaweb.estruturasdedados.listasligadas.ListaLigada;
import br.com.treinaweb.estruturasdedados.modelos.Pessoa;
import br.com.treinaweb.estruturasdedados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista ligada");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch(opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		}
		scanner.close();
	}
	
	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		listaPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		listaPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "TreinaWeb 4")); //2 elemento
		//listaPessoas.inserirEm(0, new Pessoa(5, "TreinaWeb 5")); //1 elemento //primeiro
		listaPessoas.inserirPrimeiro(new Pessoa(5, "TreinaWeb 5")); //1 elemento //primeiro
		//listaPessoas.inserirEm(4, new Pessoa(6, "TreinaWeb 6")); //4 elemento(0..4 = 5 elementos) //último
		listaPessoas.inserirUltimo(new Pessoa(6, "TreinaWeb 6")); //4 elemento(0..4 = 5 elementos) //último
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pErrada = new Pessoa(100, "TreinaWeb100");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		System.out.println("Lista de pessoas");
		for(int i=0;i<listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		b = 2;
		System.out.println("------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("------------");
		Pessoa p1 = new Pessoa(1,"TreinaWeb");
		System.out.println(p1.toString());
		//Pessoa p2 = p1; //Aponta para a mesma posição de memória //retorna true na comparação
		Pessoa p2 = new Pessoa(1,"TreinaWeb"); //criando nova posição de memória //retorna false na comparação
		System.out.println(p2.toString());
		System.out.println("------------");
		//p2.setNome("TreinaWebModificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1==p2); //compara posição na memória
		System.out.println(p1.equals(p2)); //compara valores
	}
	
	private static void fazerVetor() {
//		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
//		vetorPessoas.inserirEm(0, new Pessoa(1, "TreinaWeb"));
//		System.out.println(vetorPessoas.recuperar(0).getNome());
//		//------------
//		Vetor<Integer> vetorInteiros = new Vetor<Integer>(1);
//		vetorInteiros.inserirEm(0, 1);
//		System.out.println(vetorInteiros.recuperar(0));
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		vetorPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		vetorPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		vetorPessoas.inserir(new Pessoa(4, "TreinaWeb 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "TreinaWeb 5"));
		System.out.println(vetorPessoas);
		System.out.println("Lsita de pessoas: ");
		for (int i=0;i<vetorPessoas.tamanho();i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}
		//--------------------
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
		System.out.println(vetorPessoas.contem(p)); //true
		System.out.println(vetorPessoas.contem(pessoaErrada));//false
		//--------------------
		System.out.println(vetorPessoas.indice(p)); //existe no vetor
		System.out.println(vetorPessoas.indice(pessoaErrada)); //nao existe no vetor
		//--------------------
		vetorPessoas.remover(2);//remove TreinaWeb2
		System.out.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());
	}	
}