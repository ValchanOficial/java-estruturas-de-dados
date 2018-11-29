package br.com.treinaweb.estruturasdedados.main;

import java.util.Scanner;

import br.com.treinaweb.estruturasdedados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a op��o desejada: ");
		System.out.println("1. Gerenciamento de mem�ria");
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
		//Pessoa p2 = p1; //Aponta para a mesma posi��o de mem�ria //retorna true na compara��o
		Pessoa p2 = new Pessoa(1,"TreinaWeb"); //criando nova posi��o de mem�ria //retorna false na compara��o
		System.out.println(p2.toString());
		System.out.println("------------");
		//p2.setNome("TreinaWebModificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1==p2); //compara posi��o na mem�ria
		System.out.println(p1.equals(p2)); //compara valores
	}
}