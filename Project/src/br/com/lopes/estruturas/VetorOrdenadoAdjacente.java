package br.com.lopes.estruturas;

import br.com.lopes.grafo.Adjacente;
import br.com.lopes.grafo.Cidade;

public class VetorOrdenadoAdjacente {

	private Adjacente[] adjacentes;
	private int numeroElementos;

	public VetorOrdenadoAdjacente(int tamanho) {
		this.adjacentes = new Adjacente[tamanho];
		this.numeroElementos = 0;
	}

	public Cidade getPrimeiro() {
		return adjacentes[0].getCidade();
	}

	public void inserir(Adjacente adjacente) {
		int posicao;
		for (posicao = 0; posicao < numeroElementos; posicao++) {
			if (adjacentes[posicao].getDistanciaAEstrela() > adjacente.getDistanciaAEstrela()) {
				break;
			}
		}

		for (int k = numeroElementos; k > posicao; k--) {
			adjacentes[k] = adjacentes[k - 1];
		}

		adjacentes[posicao] = adjacente;
		numeroElementos++;
	}

	public void mostrar() {
		for (int i = 0; i < numeroElementos; i++) {
			System.out.println(adjacentes[i].getCidade().getNome() + " - " + adjacentes[i].getDistanciaAEstrela());
		}
	}

}
