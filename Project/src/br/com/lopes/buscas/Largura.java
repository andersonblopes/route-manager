package br.com.lopes.buscas;

import br.com.lopes.estruturas.Fila;
import br.com.lopes.grafo.Adjacente;
import br.com.lopes.grafo.Cidade;
import br.com.lopes.grafo.Mapa;

public class Largura {

	private Fila fronteira;
	private Cidade origem;
	private Cidade destino;

	private boolean achou;

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Largura largura = new Largura(mapa.getFortaleza(), mapa.getPacajus());
		largura.buscar();
	}

	public Largura(Cidade origem, Cidade destino) {
		this.origem = origem;
		this.origem.setVisitado(true);

		this.destino = destino;
		this.fronteira = new Fila(20);

		fronteira.enfileirar(this.origem);
		this.achou = false;
	}

	public void buscar() {
		Cidade primeiro = fronteira.getPrimeiro();
		System.out.println("Primeiro: " + primeiro.getNome());
		if (primeiro.equals(destino)) {
			this.achou = true;
			System.out.println("A Ciddae de " + destino.getNome() + " foi encontrada!");
		} else {
			System.out.println("Desenfileirou: " + fronteira.desEnfileirar().getNome());

			for (Adjacente a : primeiro.getAdjacentes()) {
				System.out.println("Verificando se já foi visitado: " + a.getCidade().getNome());
				if (!a.getCidade().isVisitado()) {
					a.getCidade().setVisitado(true);
					fronteira.enfileirar(a.getCidade());
				}
			}
			if (fronteira.getNumeroElementos() > 0) {
				buscar();
			}
		}
	}
}