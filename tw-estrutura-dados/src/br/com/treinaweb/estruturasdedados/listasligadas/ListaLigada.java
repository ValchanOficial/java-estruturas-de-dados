package br.com.treinaweb.estruturasdedados.listasligadas;

public class ListaLigada<T> {
	private No<T> primeiroNo;
	private No<T> ultimoNo;
		private int tamanho;
	
	public ListaLigada(){
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanho = 0;
	}
	
	public void inserir(T elemento) {
		No<T> novoNo = new No<T>(elemento);
		if(estaVazia()) {
			this.primeiroNo = novoNo;
			this.ultimoNo = novoNo;
		} else {
			this.ultimoNo.setProximo(novoNo);
			this.ultimoNo = novoNo; //atualiza referência
		}
		this.tamanho++;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		if(estaVazia()) {
			return "Lista []";
		} else {
			No<T> noAtual = this.primeiroNo;
			StringBuilder sb = new StringBuilder();
			sb.append("Lista [");
			sb.append(noAtual.getElemento() != null ? noAtual.getElemento().toString() : "<NULO>");
			sb.append(",");
			while(noAtual.getProximo() != null) {
				sb.append(noAtual.getProximo().getElemento() != null ? noAtual.getProximo().getElemento().toString() : "<NULO>");
				sb.append(",");
				noAtual = noAtual.getProximo(); //trocando referência
				}
			sb.append("]");
			return sb.toString();
		}
	}
}