package br.com.lopes.buscas;

import br.com.lopes.estruturas.VetorOrdenadoAdjacente;
import br.com.lopes.grafo.Adjacente;
import br.com.lopes.grafo.Cidade;
import br.com.lopes.grafo.Mapa;

public class AEstrela {
	private VetorOrdenadoAdjacente fronteira;
	private Cidade destino;
	private boolean achou;

	public AEstrela(Cidade destino) {
		this.destino = destino;
		this.achou = false;
	}

	public void buscar(Cidade atual) {
		System.out.println("\nAtual: " + atual.getNome());
		atual.setVisitado(true);
		if (atual.equals(destino)) {
			achou = true;
		} else {
			fronteira = new VetorOrdenadoAdjacente(atual.getAdjacentes().size());
			for (Adjacente a : atual.getAdjacentes()) {
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.inserir(a);
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
		AEstrela aEstrela = new AEstrela(mapa.getMossoro());
		aEstrela.buscar(mapa.getFortaleza());
	}

}
