package br.com.lopes.estruturas;

import br.com.lopes.grafo.Cidade;
import br.com.lopes.grafo.Mapa;

public class VetorOrdenado {

	private Cidade[] cidades;
	private int numeroElementos;

	public VetorOrdenado(int tamanho) {
		this.cidades = new Cidade[tamanho];
		this.numeroElementos = 0;
	}

	public void inserir(Cidade cidade) {
		int posicao;
		for (posicao = 0; posicao < numeroElementos; posicao++) {
			if (cidades[posicao].getDistanciaObjetivo() > cidade.getDistanciaObjetivo()) {
				break;
			}
		}

		for (int k = numeroElementos; k > posicao; k--) {
			cidades[k] = cidades[k - 1];
		}

		cidades[posicao] = cidade;
		numeroElementos++;
	}

	public void mostrar() {
		for (int i = 0; i < numeroElementos; i++) {
			System.out.println(cidades[i].getNome() + " - " + cidades[i].getDistanciaObjetivo());
		}
	}

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		VetorOrdenado vetor = new VetorOrdenado(5);
		vetor.inserir(mapa.getFortaleza());
		vetor.inserir(mapa.getFortim());
		vetor.inserir(mapa.getMossoro());
		vetor.inserir(mapa.getBarauna());

		vetor.mostrar();
	}

}
