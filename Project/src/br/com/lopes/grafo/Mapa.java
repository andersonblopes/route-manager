package br.com.lopes.grafo;

public class Mapa {

	private Cidade fortaleza;
	private Cidade eusebio;
	private Cidade aquiraz;
	private Cidade pindoretama;
	private Cidade cascavel;
	private Cidade beberibe;
	private Cidade fortim;
	private Cidade aracati;
	private Cidade icapui;
	private Cidade mossoro;
	private Cidade barauna;
	private Cidade russas;
	private Cidade chorozinho;
	private Cidade pacajus;
	private Cidade horizonte;
	private Cidade itaitinga;

	public Mapa() {
		this.fortaleza = new Cidade("Fortaleza");
		this.eusebio = new Cidade("Eusebio");
		this.aquiraz = new Cidade("Aquiraz");
		this.pindoretama = new Cidade("Pindoretama");
		this.cascavel = new Cidade("Cascavel");
		this.beberibe = new Cidade("Beberibe");
		this.fortim = new Cidade("Fortim");
		this.aracati = new Cidade("Aracati");
		this.icapui = new Cidade("Icapui");
		this.mossoro = new Cidade("Mossoro");
		this.barauna = new Cidade("Barauna");
		this.russas = new Cidade("Russas");
		this.chorozinho = new Cidade("Chorozinho");
		this.pacajus = new Cidade("Pacajus");
		this.horizonte = new Cidade("Horizonte");
		this.itaitinga = new Cidade("Itaitinga");

		this.fortaleza.addCidadeAdjacente(new Adjacente(eusebio));
		this.fortaleza.addCidadeAdjacente(new Adjacente(itaitinga));
		this.eusebio.addCidadeAdjacente(new Adjacente(fortaleza));
		this.eusebio.addCidadeAdjacente(new Adjacente(aquiraz));
		this.eusebio.addCidadeAdjacente(new Adjacente(itaitinga));
		this.itaitinga.addCidadeAdjacente(new Adjacente(fortaleza));
		this.itaitinga.addCidadeAdjacente(new Adjacente(eusebio));
		this.itaitinga.addCidadeAdjacente(new Adjacente(horizonte));
		this.aquiraz.addCidadeAdjacente(new Adjacente(eusebio));
		this.aquiraz.addCidadeAdjacente(new Adjacente(pindoretama));
		this.horizonte.addCidadeAdjacente(new Adjacente(itaitinga));
		this.horizonte.addCidadeAdjacente(new Adjacente(pacajus));
		this.pindoretama.addCidadeAdjacente(new Adjacente(aquiraz));
		this.pindoretama.addCidadeAdjacente(new Adjacente(cascavel));
		this.pacajus.addCidadeAdjacente(new Adjacente(horizonte));
		this.pacajus.addCidadeAdjacente(new Adjacente(chorozinho));
		this.pacajus.addCidadeAdjacente(new Adjacente(cascavel));
		this.cascavel.addCidadeAdjacente(new Adjacente(pindoretama));
		this.cascavel.addCidadeAdjacente(new Adjacente(beberibe));
		this.cascavel.addCidadeAdjacente(new Adjacente(pacajus));
		this.chorozinho.addCidadeAdjacente(new Adjacente(pacajus));
		this.chorozinho.addCidadeAdjacente(new Adjacente(russas));
		this.beberibe.addCidadeAdjacente(new Adjacente(cascavel));
		this.beberibe.addCidadeAdjacente(new Adjacente(fortim));
		this.russas.addCidadeAdjacente(new Adjacente(chorozinho));
		this.russas.addCidadeAdjacente(new Adjacente(aracati));
		this.russas.addCidadeAdjacente(new Adjacente(barauna));
		this.fortim.addCidadeAdjacente(new Adjacente(beberibe));
		this.fortim.addCidadeAdjacente(new Adjacente(aracati));
		this.aracati.addCidadeAdjacente(new Adjacente(russas));
		this.aracati.addCidadeAdjacente(new Adjacente(fortim));
		this.aracati.addCidadeAdjacente(new Adjacente(icapui));
		this.barauna.addCidadeAdjacente(new Adjacente(russas));
		this.barauna.addCidadeAdjacente(new Adjacente(mossoro));
		this.icapui.addCidadeAdjacente(new Adjacente(aracati));
		this.icapui.addCidadeAdjacente(new Adjacente(mossoro));
		this.mossoro.addCidadeAdjacente(new Adjacente(icapui));
		this.mossoro.addCidadeAdjacente(new Adjacente(barauna));
	}

	public Cidade getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Cidade fortaleza) {
		this.fortaleza = fortaleza;
	}

	public Cidade getEusebio() {
		return eusebio;
	}

	public void setEusebio(Cidade eusebio) {
		this.eusebio = eusebio;
	}

	public Cidade getAquiraz() {
		return aquiraz;
	}

	public void setAquiraz(Cidade aquiraz) {
		this.aquiraz = aquiraz;
	}

	public Cidade getPindoretama() {
		return pindoretama;
	}

	public void setPindoretama(Cidade pindoretama) {
		this.pindoretama = pindoretama;
	}

	public Cidade getCascavel() {
		return cascavel;
	}

	public void setCascavel(Cidade cascavel) {
		this.cascavel = cascavel;
	}

	public Cidade getBeberibe() {
		return beberibe;
	}

	public void setBeberibe(Cidade beberibe) {
		this.beberibe = beberibe;
	}

	public Cidade getFortim() {
		return fortim;
	}

	public void setFortim(Cidade fortim) {
		this.fortim = fortim;
	}

	public Cidade getAracati() {
		return aracati;
	}

	public void setAracati(Cidade aracati) {
		this.aracati = aracati;
	}

	public Cidade getIcapui() {
		return icapui;
	}

	public void setIcapui(Cidade icapui) {
		this.icapui = icapui;
	}

	public Cidade getMossoro() {
		return mossoro;
	}

	public void setMossoro(Cidade mossoro) {
		this.mossoro = mossoro;
	}

	public Cidade getBarauna() {
		return barauna;
	}

	public void setBarauna(Cidade barauna) {
		this.barauna = barauna;
	}

	public Cidade getRussas() {
		return russas;
	}

	public void setRussas(Cidade russas) {
		this.russas = russas;
	}

	public Cidade getChorozinho() {
		return chorozinho;
	}

	public void setChorozinho(Cidade chorozinho) {
		this.chorozinho = chorozinho;
	}

	public Cidade getPacajus() {
		return pacajus;
	}

	public void setPacajus(Cidade pacajus) {
		this.pacajus = pacajus;
	}

	public Cidade getHorizonte() {
		return horizonte;
	}

	public void setHorizonte(Cidade horizonte) {
		this.horizonte = horizonte;
	}

	public Cidade getItaitinga() {
		return itaitinga;
	}

	public void setItaitinga(Cidade itaitinga) {
		this.itaitinga = itaitinga;
	}

}
