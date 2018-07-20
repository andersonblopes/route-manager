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

		this.fortaleza = new Cidade("Fortaleza", 211); // 260
		this.eusebio = new Cidade("Eusebio", 190); // 216
		this.aquiraz = new Cidade("Aquiraz", 183); // 215
		this.pindoretama = new Cidade("Pindoretama", 167); // 192
		this.cascavel = new Cidade("Cascavel", 156); // 177
		this.beberibe = new Cidade("Beberibe", 141); // 160
		this.fortim = new Cidade("Fortim", 97); // 110
		this.aracati = new Cidade("Aracati", 84); // 91
		this.icapui = new Cidade("Icapui", 56); // 66
		this.mossoro = new Cidade("Mossoro", 0);
		this.barauna = new Cidade("Barauna", 33); // 35
		this.russas = new Cidade("Russas", 76); // 88
		this.chorozinho = new Cidade("Chorozinho", 161); // 182
		this.pacajus = new Cidade("Pacajus", 168); // 204
		this.horizonte = new Cidade("Horizonte", 175); // 214
		this.itaitinga = new Cidade("Itaitinga", 189); // 230

		this.fortaleza.addCidadeAdjacente(new Adjacente(eusebio, 24));
		this.fortaleza.addCidadeAdjacente(new Adjacente(itaitinga, 33));
		this.eusebio.addCidadeAdjacente(new Adjacente(fortaleza, 24));
		this.eusebio.addCidadeAdjacente(new Adjacente(aquiraz, 10));
		this.eusebio.addCidadeAdjacente(new Adjacente(itaitinga, 22));
		this.itaitinga.addCidadeAdjacente(new Adjacente(fortaleza, 33));
		this.itaitinga.addCidadeAdjacente(new Adjacente(eusebio, 22));
		this.itaitinga.addCidadeAdjacente(new Adjacente(horizonte, 21));
		this.aquiraz.addCidadeAdjacente(new Adjacente(eusebio, 10));
		this.aquiraz.addCidadeAdjacente(new Adjacente(pindoretama, 26));
		this.horizonte.addCidadeAdjacente(new Adjacente(itaitinga, 21));
		this.horizonte.addCidadeAdjacente(new Adjacente(pacajus, 10));
		this.pindoretama.addCidadeAdjacente(new Adjacente(aquiraz, 26));
		this.pindoretama.addCidadeAdjacente(new Adjacente(cascavel, 15));
		this.pacajus.addCidadeAdjacente(new Adjacente(horizonte, 10));
		this.pacajus.addCidadeAdjacente(new Adjacente(chorozinho, 15));
		this.pacajus.addCidadeAdjacente(new Adjacente(cascavel, 28));
		this.cascavel.addCidadeAdjacente(new Adjacente(pindoretama, 15));
		this.cascavel.addCidadeAdjacente(new Adjacente(beberibe, 24));
		this.cascavel.addCidadeAdjacente(new Adjacente(pacajus, 28));
		this.chorozinho.addCidadeAdjacente(new Adjacente(pacajus, 15));
		this.chorozinho.addCidadeAdjacente(new Adjacente(russas, 99));
		this.beberibe.addCidadeAdjacente(new Adjacente(cascavel, 24));
		this.beberibe.addCidadeAdjacente(new Adjacente(fortim, 54));
		this.russas.addCidadeAdjacente(new Adjacente(chorozinho, 99));
		this.russas.addCidadeAdjacente(new Adjacente(aracati, 72));
		this.russas.addCidadeAdjacente(new Adjacente(barauna, 52));
		this.fortim.addCidadeAdjacente(new Adjacente(beberibe, 54));
		this.fortim.addCidadeAdjacente(new Adjacente(aracati, 18));
		this.aracati.addCidadeAdjacente(new Adjacente(russas, 72));
		this.aracati.addCidadeAdjacente(new Adjacente(fortim, 18));
		this.aracati.addCidadeAdjacente(new Adjacente(icapui, 51));
		this.barauna.addCidadeAdjacente(new Adjacente(russas, 52));
		this.barauna.addCidadeAdjacente(new Adjacente(mossoro, 35));
		this.icapui.addCidadeAdjacente(new Adjacente(aracati, 51));
		this.icapui.addCidadeAdjacente(new Adjacente(mossoro, 66));
		this.mossoro.addCidadeAdjacente(new Adjacente(icapui, 66));
		this.mossoro.addCidadeAdjacente(new Adjacente(barauna, 35));

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
