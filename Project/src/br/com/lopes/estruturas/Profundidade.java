package br.com.lopes.estruturas;

import br.com.lopes.grafocidades.Adjacente;
import br.com.lopes.grafocidades.Cidade;
import br.com.lopes.grafocidades.Mapa;

public class Profundidade {

	private Pilha fronteira;
	private Cidade origem;
	private Cidade destino;
	private boolean achou;

	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Profundidade p = new Profundidade(mapa.getFortaleza(), mapa.getAquiraz());
		p.buscar();
	}

	public Profundidade(Cidade origem, Cidade destino) {
		this.origem = origem;
		this.origem.setVisitado(true);

		this.destino = destino;
		this.fronteira = new Pilha(20);

		fronteira.empilhar(this.origem);
		achou = false;
	}

	public void buscar() {
		Cidade topo = fronteira.getTopo();
		System.out.println("Topo: " + topo.getNome());

		if (topo.equals(destino)) {
			achou = true;
		} else {
			for (Adjacente a : topo.getAdjacentes()) {
				if (!achou) {
					System.out.println("Verificando se já visitado: " + a.getCidade().getNome());
					if (!a.getCidade().isVisitado()) {
						a.getCidade().setVisitado(true);
						fronteira.empilhar(a.getCidade());
						buscar(); // Recursivity
					}

				}
			}

		}
		System.out.println("Desempilhou: " + fronteira.desempilhar().getNome());

	}

}
