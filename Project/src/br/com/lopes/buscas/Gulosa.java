package br.com.lopes.buscas;

import br.com.lopes.estruturas.VetorOrdenado;
import br.com.lopes.grafo.Adjacente;
import br.com.lopes.grafo.Cidade;
import br.com.lopes.grafo.Mapa;

public class Gulosa {

	private VetorOrdenado fronteira;
	private Cidade destino;
	private boolean achou;

	public Gulosa(Cidade destino) {
		this.destino = destino;
		achou = false;
	}

	public void buscar(Cidade atual) {
		System.out.println("\nAtual: " + atual.getNome());
		atual.setVisitado(true);
		if (atual.equals(destino)) {
			achou = true;
		} else {
			fronteira = new VetorOrdenado(atual.getAdjacentes().size());
			for (Adjacente a : atual.getAdjacentes()) {
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.inserir(a.getCidade());
				}

			}

			fronteira.mostrar();
			if (fronteira.getPrimeiro() != null) {
				buscar(fronteira.getPrimeiro());
			}
		}
	}

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Gulosa g = new Gulosa(mapa.getMossoro());
		g.buscar(mapa.getFortaleza());
	}

}
