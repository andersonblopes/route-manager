package br.com.lopes.estruturas;

import br.com.lopes.grafocidades.Cidade;
import br.com.lopes.grafocidades.Mapa;

public class Fila {

	private int tamanho;
	private Cidade[] cidades;
	private int inicio;
	private int fim;
	private int numeroElementos;

	public static void main(String[] args) {
		Fila fila = new Fila(5);
		Mapa mapa = new Mapa();
	}

	public Fila(int tamanho) {
		this.tamanho = tamanho;
		this.cidades = new Cidade[this.tamanho];
		inicio = 0;
		fim = -1;
		numeroElementos = 0;
	}

	public void enfileirar(Cidade cidade) {
		if (!isFilaCheia()) {
			if (fim == tamanho - 1) {
				fim = -1;
			}
			cidades[++fim] = cidade;
			numeroElementos++;
		} else {
			System.out.println("A fila já está cheia!");
		}
	}

	public Cidade desEnfileirar() {
		if (!isFilaVazia()) {
			Cidade temp = cidades[inicio++];
			if (inicio == tamanho) {
				inicio = 0;
			}
			numeroElementos--;
			return temp;
		} else {
			System.out.println("A Fila está vazia!");
			return null;
		}
	}

	public Cidade getPrimeiro() {
		return cidades[inicio];
	}

	private boolean isFilaVazia() {
		return numeroElementos == 0;
	}

	private boolean isFilaCheia() {
		return numeroElementos == tamanho;
	}

}