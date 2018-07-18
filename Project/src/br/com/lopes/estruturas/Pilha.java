package br.com.lopes.estruturas;

import br.com.lopes.grafocidades.Cidade;
import br.com.lopes.grafocidades.Mapa;

public class Pilha {

	private int tamanho;
	private Cidade[] cidades;
	private int topo;

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		Mapa mapa = new Mapa();

		pilha.empilhar(mapa.getFortaleza());
		pilha.empilhar(mapa.getMossoro());
		pilha.empilhar(mapa.getFortim());
		pilha.empilhar(mapa.getAquiraz());
		pilha.empilhar(mapa.getAracati());
		pilha.empilhar(mapa.getBarauna());

		System.out.println("A Cidade no topo da pilha é: " + pilha.getTopo().getNome());

		pilha.desempilhar();

		System.out.println("A Cidade no topo da pilha é: " + pilha.getTopo().getNome());
	}

	public Pilha(int tamanho) {
		this.tamanho = tamanho;
		this.cidades = new Cidade[this.tamanho];
		this.topo = -1;
	}

	public void empilhar(Cidade cidade) {
		if (!isPilhaCheia()) {
			System.out.println("Empilhando: " + cidade.getNome());
			this.cidades[++topo] = cidade;
		} else {
			System.out.println("A pilha já está cheia!");
		}
	}

	public Cidade desempilhar() {
		if (!isPilhaVazia()) {
			return cidades[topo--];
		} else {
			System.out.println("A pilha já está vazia!");
			return null;
		}
	}

	public Cidade getTopo() {
		return cidades[topo];
	}

	private boolean isPilhaVazia() {
		return topo == -1;
	}

	private boolean isPilhaCheia() {
		return (topo == tamanho - 1);
	}

}
