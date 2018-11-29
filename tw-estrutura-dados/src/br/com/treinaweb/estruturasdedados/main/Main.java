package br.com.treinaweb.estruturasdedados.main;

import java.util.Scanner;

import br.com.treinaweb.estruturasdedados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch(opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		}
		scanner.close();
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
}